package com.sect.elderly_health_app.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "dietary_assessments")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DietaryAssessment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "participant_id", nullable = false, unique = true)
    private Participant participant;

    private String dailyMeals;

    private String fluidIntake;

    private String balancedDiet;

    private String dietarySupplements;

    private String dietarySupplementDetails;

    private String weightChangePastYear;
}
