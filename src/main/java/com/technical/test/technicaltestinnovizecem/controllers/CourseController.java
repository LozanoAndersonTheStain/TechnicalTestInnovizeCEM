package com.technical.test.technicaltestinnovizecem.controllers;

import com.technical.test.technicaltestinnovizecem.contracts.request.CourseRequest;
import com.technical.test.technicaltestinnovizecem.contracts.responses.CourseResponse;
import com.technical.test.technicaltestinnovizecem.exeptions.course.CourseNotFoundException;
import com.technical.test.technicaltestinnovizecem.services.CourseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class CourseController {
    public final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping("/getCourseById/{id}")
    public ResponseEntity<?> getCourseById(@PathVariable Long id) {
        try {
            CourseResponse courseResponse = courseService.getCourseById(id);
            return ResponseEntity.status(HttpStatus.OK).body(courseResponse);
        } catch (CourseNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }

    @GetMapping("/getAllCourses")
    public ResponseEntity<List<CourseResponse>> getAllCourses() {
        List<CourseResponse> courseResponses = courseService.getAllCourses();
        return ResponseEntity.status(HttpStatus.OK).body(courseResponses);
    }

    @GetMapping("/getAllCoursesByTeacherName/{teacherName}")
    public ResponseEntity<List<CourseResponse>> getAllCoursesByTeacherName(@PathVariable String teacherName) {
        List<CourseResponse> courseResponses = courseService.getAllCoursesByTeacherName(teacherName);
        return ResponseEntity.status(HttpStatus.OK).body(courseResponses);
    }

    @GetMapping("/getAllCoursesByPrice/{price}")
    public ResponseEntity<List<CourseResponse>> getAllCoursesByPrice(@PathVariable Double price) {
        List<CourseResponse> courseResponses = courseService.getAllCoursesByPrice(price);
        return ResponseEntity.status(HttpStatus.OK).body(courseResponses);
    }

    @GetMapping("/getCourseByName/{courseName}")
    public ResponseEntity<List<CourseResponse>> getCourseByName(@PathVariable String courseName) {
        List<CourseResponse> courseResponses = courseService.getCourseByName(courseName);
        return ResponseEntity.status(HttpStatus.OK).body(courseResponses);
    }

    @PostMapping("/createCourse")
    public ResponseEntity<CourseResponse> createCourse(@RequestBody CourseRequest courseRequest) {
        CourseResponse courseResponse = courseService.createCourse(courseRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(courseResponse);
    }

    @PutMapping("/updateCourse/{id}")
    public ResponseEntity<CourseResponse> updateCourse(@PathVariable Long id, @RequestBody CourseRequest courseRequest) {
        CourseResponse courseResponse = courseService.updateCourse(id, courseRequest);
        return ResponseEntity.status(HttpStatus.OK).body(courseResponse);
    }

    @DeleteMapping("/deleteCourse/{id}")
    public ResponseEntity<CourseResponse> deleteCourse(@PathVariable Long id) {
        courseService.deleteCourse(id);
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }
}
