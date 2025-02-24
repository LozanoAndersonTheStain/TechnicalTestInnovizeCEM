package com.technical.test.technicaltestinnovizecem.controllers;

import com.technical.test.technicaltestinnovizecem.contracts.request.CourseRequest;
import com.technical.test.technicaltestinnovizecem.contracts.responses.CourseResponse;
import com.technical.test.technicaltestinnovizecem.exeptions.course.CourseNotFoundException;
import com.technical.test.technicaltestinnovizecem.services.CourseService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.*;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
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

    @Operation(summary = "Get course by ID",
            description = "With this method, information is obtained from a single course.",
            operationId = "getCourseById",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Course found",
                            content = {@Content(schema = @Schema(implementation = CourseResponse.class))}),
                    @ApiResponse(responseCode = "404", description = "Course not found",
                            content = {@Content(schema = @Schema(implementation = String.class))})
            }
    )
    @GetMapping("/getCourseById/{id}")
    public ResponseEntity<?> getCourseById(@PathVariable Long id) {
        try {
            CourseResponse courseResponse = courseService.getCourseById(id);
            return ResponseEntity.status(HttpStatus.OK).body(courseResponse);
        } catch (CourseNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }

    @Operation(summary = "Get all courses",
            description = "With this method, information is obtained from all courses.",
            operationId = "getAllCourses",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Courses found",
                            content = {@Content(schema = @Schema(implementation = CourseResponse.class))}),
                    @ApiResponse(responseCode = "404", description = "Courses not found",
                            content = {@Content(schema = @Schema(implementation = String.class))})
            }
    )
    @GetMapping("/getAllCourses")
    public ResponseEntity<List<CourseResponse>> getAllCourses() {
        List<CourseResponse> courseResponses = courseService.getAllCourses();
        return ResponseEntity.status(HttpStatus.OK).body(courseResponses);
    }

    @Operation(summary = "Get all courses by price",
            description = "With this method, information is obtained from all courses by price.",
            operationId = "getAllCoursesByPrice",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Courses found",
                            content = {@Content(schema = @Schema(implementation = CourseResponse.class))}),
                    @ApiResponse(responseCode = "404", description = "Courses not found",
                            content = {@Content(schema = @Schema(implementation = String.class))})
            }
    )
    @GetMapping("/getAllCoursesByPrice/{price}")
    public ResponseEntity<List<CourseResponse>> getAllCoursesByPrice(@PathVariable Double price) {
        List<CourseResponse> courseResponses = courseService.getAllCoursesByPrice(price);
        return ResponseEntity.status(HttpStatus.OK).body(courseResponses);
    }

    @Operation(summary = "Get course by name",
            description = "With this method, information is obtained from a single course by name.",
            operationId = "getCourseByName",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Course found",
                            content = {@Content(schema = @Schema(implementation = CourseResponse.class))}),
                    @ApiResponse(responseCode = "404", description = "Course not found",
                            content = {@Content(schema = @Schema(implementation = String.class))})
            }
    )
    @GetMapping("/getCourseByName/{courseName}")
    public ResponseEntity<List<CourseResponse>> getCourseByName(@PathVariable String courseName) {
        List<CourseResponse> courseResponses = courseService.getCourseByName(courseName);
        return ResponseEntity.status(HttpStatus.OK).body(courseResponses);
    }

    @Operation(summary = "Get course by teacher name",
            description = "With this method, information is obtained from a single course by teacher name.",
            operationId = "getCourseByTeacherName",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Course found",
                            content = {@Content(schema = @Schema(implementation = CourseResponse.class))}),
                    @ApiResponse(responseCode = "404", description = "Course not found",
                            content = {@Content(schema = @Schema(implementation = String.class))})
            }
    )
    @GetMapping("/getCourseByTeacherName/{teacherName}")
    public ResponseEntity<List<CourseResponse>> getCourseByTeacherName(@PathVariable String teacherName) {
        List<CourseResponse> courseResponses = courseService.getCourseByTeacherName(teacherName);
        return ResponseEntity.status(HttpStatus.OK).body(courseResponses);
    }

    @Operation(summary = "Get course by duration weeks",
            description = "With this method, information is obtained from a single course by duration weeks.",
            operationId = "getCourseByDurationWeeks",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Course found",
                            content = {@Content(schema = @Schema(implementation = CourseResponse.class))}),
                    @ApiResponse(responseCode = "404", description = "Course not found",
                            content = {@Content(schema = @Schema(implementation = String.class))})
            }
    )
    @GetMapping("/getCourseByDurationWeeks/{durationWeeks}")
    public ResponseEntity<List<CourseResponse>> getCourseByDurationWeeks(@PathVariable Integer durationWeeks) {
        List<CourseResponse> courseResponses = courseService.getCourseByDurationWeeks(durationWeeks);
        return ResponseEntity.status(HttpStatus.OK).body(courseResponses);
    }

    @Operation(summary = "Create course",
            description = "With this method, a course is created.",
            operationId = "createCourse",
            responses = {
                    @ApiResponse(responseCode = "201", description = "Course created",
                            content = {@Content(schema = @Schema(implementation = CourseResponse.class))}),
                    @ApiResponse(responseCode = "400", description = "Bad request",
                            content = {@Content(schema = @Schema(implementation = String.class))}),
                    @ApiResponse(responseCode = "409", description = "Course already exists",
                            content = {@Content(schema = @Schema(implementation = String.class))})
            }
    )
    @PostMapping("/createCourse")
    public ResponseEntity<CourseResponse> createCourse(@RequestBody CourseRequest courseRequest) {
        CourseResponse courseResponse = courseService.createCourse(courseRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(courseResponse);
    }

    @Operation(summary = "Update course",
            description = "With this method, a course is updated.",
            operationId = "updateCourse",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Course updated",
                            content = {@Content(schema = @Schema(implementation = CourseResponse.class))}),
                    @ApiResponse(responseCode = "404", description = "Course not found",
                            content = {@Content(schema = @Schema(implementation = String.class))})
            }
    )
    @PutMapping("/updateCourse/{id}")
    public ResponseEntity<CourseResponse> updateCourse(@PathVariable Long id, @RequestBody CourseRequest courseRequest) {
        CourseResponse courseResponse = courseService.updateCourse(id, courseRequest);
        return ResponseEntity.status(HttpStatus.OK).body(courseResponse);
    }

    @Operation(summary = "Delete course",
            description = "With this method, a course is deleted.",
            operationId = "deleteCourse",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Course deleted",
                            content = {@Content(schema = @Schema(implementation = CourseResponse.class))}),
                    @ApiResponse(responseCode = "404", description = "Course not found",
                            content = {@Content(schema = @Schema(implementation = String.class))})
            }
    )
    @DeleteMapping("/deleteCourse/{id}")
    public ResponseEntity<CourseResponse> deleteCourse(@PathVariable Long id) {
        courseService.deleteCourse(id);
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }
}
