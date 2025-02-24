package com.technical.test.technicaltestinnovizecem.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(auth -> auth
                        // Admin can only access the following endpoints
                        .requestMatchers("/api/teacher/**", "/api/course/**").hasRole("ADMIN")

                        // Student can only access the following endpoints
                        .requestMatchers("/api/teacher/getTeacherById/**", "/api/teacher/getAllTeachers", "/getAllTeachersByCourseName/{courseName}",
                                "/api/course/getCourseById/**",  "/api/course/getAllCourses",  "/getAllCoursesByTeacherName/{teacherName}",
                               "/getAllCoursesByPrice/{price}",  "/getCourseByName/{courseName}").hasRole( "STUDENT")

                        // Teacher can only access the following endpoints
                        .requestMatchers("/api/teacher/getTeacherById/**", "/api/teacher/getAllTeachers",  "/getAllTeachersByCourseName/{courseName}",
                                "/api/course/getCourseById/**", "/api/course/getAllCourses",  "/api/course/getAllCoursesByTeacherName/**",
                                "/api/course/getAllCoursesByPrice/**", "/api/course/updateCourse/**").hasRole("TEACHER")
                        .anyRequest().authenticated()
                )
                .httpBasic(Customizer.withDefaults())
                .csrf(csrf -> csrf.disable());
        return http.build();
    }

    @Bean
    public UserDetailsService userDetailsService() {
        UserDetails admin = User.withDefaultPasswordEncoder()
                .username("admin")
                .password("admin")
                .roles("ADMIN")
                .build();
        UserDetails student = User.withDefaultPasswordEncoder()
                .username("student")
                .password("student")
                .roles("STUDENT")
                .build();
        UserDetails teacher = User.withDefaultPasswordEncoder()
                .username("teacher")
                .password("teacher")
                .roles("TEACHER")
                .build();
        return new InMemoryUserDetailsManager(admin, student, teacher);
    }
}