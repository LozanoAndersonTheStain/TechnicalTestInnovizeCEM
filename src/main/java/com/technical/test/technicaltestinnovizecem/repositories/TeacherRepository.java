package com.technical.test.technicaltestinnovizecem.repositories;

import com.technical.test.technicaltestinnovizecem.models.TeacherEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TeacherRepository extends JpaRepository<TeacherEntity, Long> {
    boolean existsByNameAndEmail(String name, String email);

    @Query("SELECT t FROM teachers t JOIN t.courses c WHERE c.nameCourse = :courseName")
    List<TeacherEntity> getTeacherByCourseName(String courseName);
}
