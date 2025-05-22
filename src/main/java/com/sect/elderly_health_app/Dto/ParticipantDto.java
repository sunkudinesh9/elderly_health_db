package com.sect.elderly_health_app.Dto;

import com.sect.elderly_health_app.enums.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ParticipantDto {
    private String name;
    private String participantId;
    private Cohort cohort;
    private GramaPanchayatas gramPanchayat;
    private String fatherName;
    private String motherName;
    private LocalDate dateOfBirth;
    private Integer age;
    private String occupation;
    private Gender gender;
    private MaritalStatus maritalStatus;
    private LivingStatus livingStatus;
    private HealthProfileDto healthProfileDto;
    private DietaryAssessmentDto dietaryAssessmentDto;
    private SocialProfileDto socialProfileDto;
    private AnthropometryDto anthropometryDto;
    private PhysicalActivityDto physicalActivityDto;
    private VitalsDto vitalsDto;

}
