package com.sect.elderly_health_app.Dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DietaryAssessmentDto {
    private String dailyMeals;
    private String fluidIntake;
    private String balancedDiet;
    private String dietarySupplements;
    private String dietarySupplementDetails;
    private String weightChangePastYear;
}
