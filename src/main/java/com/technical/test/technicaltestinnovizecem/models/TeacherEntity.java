package com.technical.test.technicaltestinnovizecem.models;

import com.technical.test.technicaltestinnovizecem.contracts.responses.TeacherResponse;
import com.technical.test.technicaltestinnovizecem.models.enums.RolUser;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity(name = "teachers")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class TeacherEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 150)
    private String name;

    @Column(nullable = false, length = 30)
    private String document;

    @Column(nullable = false, length = 30)
    private String email;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private RolUser rolUser;

    @OneToMany(mappedBy = "teacherId")
    private List<CourseEntity> courses;

    public TeacherResponse toResponse() {
        return TeacherResponse.builder()
                .id(this.id.toString())
                .name(this.name)
                .document(this.document)
                .email(this.email)
                .rolUser(this.rolUser)
                .build();
    }
}
