package com.technical.test.technicaltestinnovizecem.contracts.responses;

import lombok.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CourseResponse {
    private String nameCourse;
    private String description;
    private int durationWeeks;
    private double price;
    private Date startDate;
    private Long teacherId;
}
