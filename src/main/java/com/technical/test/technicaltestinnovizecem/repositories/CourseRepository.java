package com.technical.test.technicaltestinnovizecem.repositories;

import com.technical.test.technicaltestinnovizecem.models.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CourseRepository extends JpaRepository<CourseEntity, Long> {
    @Query("SELECT c FROM cursos c JOIN c.teacherId t WHERE t.name = :teacherName")
    List<CourseEntity> findCourseByTeacherName(String teacherName);

    @Query("SELECT c FROM cursos  c WHERE c.price = :price")
    List<CourseEntity> findAllByPrice(Double price);

    @Query("SELECT c FROM cursos  c WHERE c.nameCourse = :courseName")
    List<CourseEntity> findCourseByName(String courseName);

    @Query("SELECT CASE WHEN COUNT(c) > 0 THEN true ELSE false END FROM cursos c WHERE c.nameCourse = :nameCourse")
    boolean existsCourseByName(String nameCourse);
}
