package com.sect.elderly_health_app.Dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HealthProfileDto {
    private Boolean anyHealthIssue; // true = Yes, false = No
    private String healthIssuesDescription; // e.g., Diabetes, Hypertension, etc.
    private Boolean underMedication;
    private String medicationDetails;
    private Boolean healthcareAccess;
    private String healthcareFacility; // e.g., Government Hospital, PHC, Private, etc.
    private String lastCheckupDate; // Optional: could be changed to LocalDate if needed
    private Boolean hasDisability;
    private String disabilityType; // e.g., Visual, Hearing, Mobility, etc.
}
