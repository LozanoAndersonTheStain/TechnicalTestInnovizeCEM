package com.technical.test.technicaltestinnovizecem.controllers;

import com.technical.test.technicaltestinnovizecem.contracts.request.TeacherRequest;
import com.technical.test.technicaltestinnovizecem.contracts.responses.TeacherResponse;
import com.technical.test.technicaltestinnovizecem.exeptions.teacher.InvalidTeacherDataException;
import com.technical.test.technicaltestinnovizecem.exeptions.teacher.TeacherAlreadyExistsException;
import com.technical.test.technicaltestinnovizecem.services.TeacherService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
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

    @Operation(summary = "Get teacher by ID",
            description = "With this method, information is obtained from a single teacher.",
            operationId = "getTeacherByID",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Teacher found",
                            content = {@Content(schema = @Schema(implementation = TeacherResponse.class))}),
                    @ApiResponse(responseCode = "404", description = "Teacher not found",
                            content = {@Content(schema = @Schema(implementation = String.class))})
            }
    )
    @GetMapping("/getTeacherById/{id}")
    public ResponseEntity<TeacherResponse> getTeacherByID(@PathVariable Long id) {
        TeacherResponse teacherResponse = teacherService.getTeacherById(id);
        return ResponseEntity.status(HttpStatus.OK).body(teacherResponse);
    }

    @Operation(summary = "Get all teachers",
            description = "With this method, information is obtained from all teachers.",
            operationId = "getAllTeachers",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Teachers found",
                            content = {@Content(schema = @Schema(implementation = TeacherResponse.class))}),
                    @ApiResponse(responseCode = "404", description = "Teachers not found",
                            content = {@Content(schema = @Schema(implementation = String.class))})
            }
    )
    @GetMapping("/getAllTeachers")
    public ResponseEntity<List<TeacherResponse>> getAllTeachers() {
        List<TeacherResponse> teacherResponses = teacherService.getAllTeachers();
        return ResponseEntity.status(HttpStatus.OK).body(teacherResponses);
    }

    @Operation(summary = "Create teacher",
            description = "With this method, a teacher is created.",
            operationId = "createTeacher",
            responses = {
                    @ApiResponse(responseCode = "201", description = "Teacher created",
                            content = {@Content(schema = @Schema(implementation = TeacherResponse.class))}),
                    @ApiResponse(responseCode = "409", description = "Teacher already exists",
                            content = {@Content(schema = @Schema(implementation = String.class))}),
                    @ApiResponse(responseCode = "400", description = "Invalid teacher data",
                            content = {@Content(schema = @Schema(implementation = String.class))})
                }
            )
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

        @Operation(summary = "Update teacher",
                description = "With this method, a teacher is updated.",
                operationId = "updateTeacher",
                responses = {
                        @ApiResponse(responseCode = "200", description = "Teacher updated",
                                content = {@Content(schema = @Schema(implementation = TeacherResponse.class))}),
                        @ApiResponse(responseCode = "404", description = "Teacher not found",
                                content = {@Content(schema = @Schema(implementation = String.class))}),
                        @ApiResponse(responseCode = "400", description = "Invalid teacher data",
                                content = {@Content(schema = @Schema(implementation = String.class))})
                }
        )
        @PutMapping("/updateTeacher/{id}")
        public ResponseEntity<TeacherResponse> updateTeacher(@PathVariable Long id ,@RequestBody TeacherRequest teacherRequest) {
            TeacherResponse teacherResponse = teacherService.updateTeacher(id, teacherRequest);
            return ResponseEntity.status(HttpStatus.OK).body(teacherResponse);
        }

        @Operation(summary = "Delete teacher",
                description = "With this method, a teacher is deleted.",
                operationId = "deleteTeacher",
                responses = {
                        @ApiResponse(responseCode = "200", description = "Teacher deleted",
                                content = {@Content(schema = @Schema(implementation = String.class))}),
                        @ApiResponse(responseCode = "404", description = "Teacher not found",
                                content = {@Content(schema = @Schema(implementation = String.class))})
                }
        )
        @DeleteMapping("/deleteTeacher/{id}")
        public ResponseEntity<Map<String, String>> deleteTeacher(@PathVariable Long id) {
            teacherService.deleteTeacher(id);
            return ResponseEntity.status(HttpStatus.OK).body(Map.of("message", "Teacher deleted successfully"));
        }
}
