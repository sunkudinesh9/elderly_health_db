package com.sect.elderly_health_app.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "health_profile")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HealthProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "participant_id")
    private Participant participant;

    @Column(name = "any_health_issue", nullable = false)
    private Boolean anyHealthIssue; // true = Yes, false = No

    @Column(name = "health_issues_description")
    private String healthIssuesDescription; // e.g., Diabetes, Hypertension, etc.

    @Column(name = "under_medication", nullable = false)
    private Boolean underMedication;

    @Column(name = "medication_details")
    private String medicationDetails;

    @Column(name = "healthcare_access", nullable = false)
    private Boolean healthcareAccess;

    @Column(name = "healthcare_facility")
    private String healthcareFacility; // e.g., Government Hospital, PHC, Private, etc.

    @Column(name = "last_checkup_date")
    private String lastCheckupDate; // Optional: could be changed to LocalDate if needed

    @Column(name = "has_disability", nullable = false)
    private Boolean hasDisability;

    @Column(name = "disability_type")
    private String disabilityType; // e.g., Visual, Hearing, Mobility, etc.
}
