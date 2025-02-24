package com.technical.test.technicaltestinnovizecem.repositories;

import com.technical.test.technicaltestinnovizecem.models.TeacherEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<TeacherEntity, Long> {
    boolean existsByNameAndEmail(String name, String email);
}
