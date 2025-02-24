package com.technical.test.technicaltestinnovizecem.services;

import com.technical.test.technicaltestinnovizecem.contracts.request.TeacherRequest;
import com.technical.test.technicaltestinnovizecem.contracts.responses.TeacherResponse;
import com.technical.test.technicaltestinnovizecem.exeptions.teacher.TeacherAlreadyExistsException;
import com.technical.test.technicaltestinnovizecem.exeptions.teacher.TeacherNotFoundException;
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

    public List<TeacherResponse> getTeacherByCourseName(String courseName) {
        return _teacherRepository.getTeacherByCourseName(courseName).stream().map(TeacherEntity::toResponse).collect(Collectors.toList());
    }

    public TeacherResponse createTeacher(TeacherRequest teacherRequest) {
        if (_teacherRepository.existsByNameAndEmail(teacherRequest.getName(), teacherRequest.getEmail())) {
            throw new TeacherAlreadyExistsException("The teacher with name " + teacherRequest.getName() + " and email " + teacherRequest.getEmail() + " already exists");
        }
        return _teacherRepository.save(teacherRequest.toEntity()).toResponse();
    }

    public TeacherResponse updateTeacher(@PathVariable Long id, TeacherRequest teacherRequest) {
        TeacherEntity existTeacher = _teacherRepository.findById(id)
                .orElseThrow(() -> new TeacherNotFoundException("The teacher with id " + id + " does not exist"));

        existTeacher.setName(teacherRequest.getName());
        existTeacher.setDocument(teacherRequest.getDocument());
        existTeacher.setEmail(teacherRequest.getEmail());
        existTeacher.setRolUser(teacherRequest.getRolUser());

        return _teacherRepository.save(existTeacher).toResponse();
    }

    public void deleteTeacher(Long id) {
        _teacherRepository.deleteById(id);
    }
}
