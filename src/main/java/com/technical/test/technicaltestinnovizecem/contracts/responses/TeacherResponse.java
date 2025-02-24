package com.technical.test.technicaltestinnovizecem.contracts.responses;

import com.technical.test.technicaltestinnovizecem.models.enums.RolUser;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TeacherResponse {
    private String id;
    private String name;
    private String document;
    private String email;
    private RolUser rolUser;
}
