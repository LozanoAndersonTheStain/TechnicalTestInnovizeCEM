package com.technical.test.technicaltestinnovizecem.repositories;

import com.technical.test.technicaltestinnovizecem.models.TeacherEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TeacherRepository extends JpaRepository<TeacherEntity, Long> {
    @Query("SELECT t FROM teachers t WHERE t.name = ?1")
    List<TeacherEntity> findByCourseName(String courseName);

    boolean existsByNameAndEmail(String name, String email);
}
