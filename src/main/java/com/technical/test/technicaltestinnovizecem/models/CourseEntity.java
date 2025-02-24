package com.technical.test.technicaltestinnovizecem.models;

import com.technical.test.technicaltestinnovizecem.contracts.responses.CourseResponse;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity(name = "cursos")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class CourseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 150)
    private String nameCourse;

    @Column(nullable = false, length = 500)
    private String description;

    @Column(nullable = false)
    private int durationWeeks;

    @Column(nullable = false)
    private double price;

    @Column(nullable = false)
    private Date startDate;

    @ManyToOne
    @JoinColumn(name = "teacher_id", nullable = false)
    private TeacherEntity teacherId;

    public CourseResponse toResponse() {
        return CourseResponse.builder()
                .nameCourse(this.nameCourse)
                .description(this.description)
                .durationWeeks(this.durationWeeks)
                .price(this.price)
                .startDate(this.startDate)
                .teacherId(this.getId())
                .build();
    }
}
