package com.technical.test.technicaltestinnovizecem.services;

import com.technical.test.technicaltestinnovizecem.contracts.request.TeacherRequest;
import com.technical.test.technicaltestinnovizecem.contracts.responses.TeacherResponse;
import com.technical.test.technicaltestinnovizecem.exeptions.course.CourseAlreadyExistsException;
import com.technical.test.technicaltestinnovizecem.models.TeacherEntity;
import com.technical.test.technicaltestinnovizecem.repositories.TeacherRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TeacherService {
    private final TeacherRepository _teacherRepository;

    public TeacherService(TeacherRepository teacherRepository) {
        this._teacherRepository = teacherRepository;
    }

    public TeacherResponse getTeacherById(@PathVariable Long id) {
        return _teacherRepository.findById(id).orElse(null).toResponse();
    }

    public List<TeacherResponse> getAllTeachers() {
        return _teacherRepository.findAll().stream().map(TeacherEntity::toResponse).collect(Collectors.toList());
    }

    public List<TeacherResponse> getAllTeachersByCourseName(@PathVariable String courseName) {
        return _teacherRepository.findByCourseName(courseName).stream().map(TeacherEntity::toResponse).collect(Collectors.toList());
    }

    public TeacherResponse createTeacher(TeacherRequest teacherRequest) {
        if (_teacherRepository.existsByNameAndEmail(teacherRequest.getName(), teacherRequest.getEmail())) {
            throw new CourseAlreadyExistsException("The teacher with name " + teacherRequest.getName() + " and email " + teacherRequest.getEmail() + " already exists");
        }
        return _teacherRepository.save(teacherRequest.toEntity()).toResponse();
    }

    public TeacherResponse updateTeacher(@PathVariable Long id, TeacherRequest teacherRequest) {
        return _teacherRepository.save(teacherRequest.toEntity()).toResponse();
    }

    public void deleteTeacher(Long id) {
        _teacherRepository.deleteById(id);
    }
}
