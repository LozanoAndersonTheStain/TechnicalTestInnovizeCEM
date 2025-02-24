package com.technical.test.technicaltestinnovizecem.services;

import com.technical.test.technicaltestinnovizecem.contracts.request.CourseRequest;
import com.technical.test.technicaltestinnovizecem.contracts.responses.CourseResponse;
import com.technical.test.technicaltestinnovizecem.exeptions.course.CourseNotFoundException;
import com.technical.test.technicaltestinnovizecem.models.CourseEntity;
import com.technical.test.technicaltestinnovizecem.repositories.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseService {
    private final CourseRepository _courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this._courseRepository = courseRepository;
    }

    public CourseResponse getCourseById(Long id) {
        CourseEntity courseEntity = _courseRepository.findById(id)
                .orElseThrow(() -> new CourseNotFoundException("Course not found with id: " + id));
        return courseEntity.toResponse();
    }

    public  List<CourseResponse> getAllCourses() {
        return _courseRepository.findAll().stream().map(CourseEntity::toResponse).collect(Collectors.toList());
    }

    public List<CourseResponse> getAllCoursesByTeacherName(String teacherName) {
        return _courseRepository.findAllByTeacherName(teacherName).stream().map(CourseEntity::toResponse).collect(Collectors.toList());
    }

    public List<CourseResponse> getAllCoursesByPrice(Double price) {
        return _courseRepository.findAllByPrice(price).stream().map(CourseEntity::toResponse).collect(Collectors.toList());
    }

    public List<CourseResponse> getCourseByName(String courseName) {
        return _courseRepository.findCourseByName(courseName).stream().map(CourseEntity::toResponse).collect(Collectors.toList());
    }

    public CourseResponse createCourse(CourseRequest courseRequest) {
        if (_courseRepository.existsCourseByName(courseRequest.getNameCourse())){
            throw new CourseNotFoundException("The course with name " + courseRequest.getNameCourse() + " already exists");
        }
        return _courseRepository.save(courseRequest.toEntity()).toResponse();
    }

    public CourseResponse updateCourse(Long id, CourseRequest courseRequest) {
        return _courseRepository.save(courseRequest.toEntity()).toResponse();
    }

    public void deleteCourse(Long id) {
        _courseRepository.deleteById(id);
    }
}
