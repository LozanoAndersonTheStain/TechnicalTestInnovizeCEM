package com.technical.test.technicaltestinnovizecem.controllers;

import com.technical.test.technicaltestinnovizecem.contracts.request.TeacherRequest;
import com.technical.test.technicaltestinnovizecem.contracts.responses.TeacherResponse;
import com.technical.test.technicaltestinnovizecem.exeptions.teacher.InvalidTeacherDataException;
import com.technical.test.technicaltestinnovizecem.exeptions.teacher.TeacherAlreadyExistsException;
import com.technical.test.technicaltestinnovizecem.services.TeacherService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/teacher")
public class TeacherController  {
    private final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

        @GetMapping("/getTeacherById/{id}")
        public ResponseEntity<TeacherResponse> getTeacherByID(@PathVariable Long id) {
            TeacherResponse teacherResponse = teacherService.getTeacherById(id);
            return ResponseEntity.status(HttpStatus.OK).body(teacherResponse);
        }

        @GetMapping("/getAllTeachers")
        public ResponseEntity<List<TeacherResponse>> getAllTeachers() {
            List<TeacherResponse> teacherResponses = teacherService.getAllTeachers();
            return ResponseEntity.status(HttpStatus.OK).body(teacherResponses);
        }

        @GetMapping("/getAllTeachersByCourseName/{courseName}")
        public ResponseEntity<List<TeacherResponse>> getAllTeachersByCourseName(@PathVariable String courseName) {
            List<TeacherResponse> teacherResponses = teacherService.getAllTeachersByCourseName(courseName);
            return ResponseEntity.status(HttpStatus.OK).body(teacherResponses);
        }

        @PostMapping("/createTeacher")
        public ResponseEntity<TeacherResponse> createTeacher(@RequestBody TeacherRequest teacherRequest) {
            try {
                TeacherResponse teacherResponse = teacherService.createTeacher(teacherRequest);
                return ResponseEntity.status(HttpStatus.CREATED).body(teacherResponse);
            } catch (TeacherAlreadyExistsException e) {
                return ResponseEntity.status(HttpStatus.CONFLICT).build();
            } catch (InvalidTeacherDataException e) {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
            }
        }

        @PutMapping("/updateTeacher/{id}")
        public ResponseEntity<TeacherResponse> updateTeacher(@PathVariable Long id ,@RequestBody TeacherRequest teacherRequest) {
            TeacherResponse teacherResponse = teacherService.updateTeacher(id, teacherRequest);
            return ResponseEntity.status(HttpStatus.OK).body(teacherResponse);
        }

        @DeleteMapping("/deleteTeacher/{id}")
        public ResponseEntity<Map<String, String>> deleteTeacher(@PathVariable Long id) {
            teacherService.deleteTeacher(id);
            return ResponseEntity.status(HttpStatus.OK).body(Map.of("message", "Teacher deleted successfully"));
        }
}
