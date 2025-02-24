package com.technical.test.technicaltestinnovizecem.contracts.request;

import com.technical.test.technicaltestinnovizecem.models.CourseEntity;
import com.technical.test.technicaltestinnovizecem.models.TeacherEntity;
import lombok.*;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CourseRequest {
    private String nameCourse;
    private String description;
    private int durationWeeks;
    private double price;
    private Date startDate;
    private TeacherEntity teacherId;

    public CourseEntity toEntity() {
        return CourseEntity.builder()
                .nameCourse(nameCourse)
                .description(description)
                .durationWeeks(durationWeeks)
                .price(price)
                .startDate(startDate)
                .teacherId(teacherId)
                .build();
    }
}
