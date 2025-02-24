package com.technical.test.technicaltestinnovizecem.contracts.request;

import com.technical.test.technicaltestinnovizecem.models.TeacherEntity;
import com.technical.test.technicaltestinnovizecem.models.enums.RolUser;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TeacherRequest {
    private String name;
    private String document;
    private String email;
    private RolUser rolUser;

    public TeacherEntity toEntity() {
        return TeacherEntity.builder()
                .name(name)
                .document(document)
                .email(email)
                .rolUser(rolUser)
                .build();
    }
}
