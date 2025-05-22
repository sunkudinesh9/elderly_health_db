package com.sect.elderly_health_app.Dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AnthropometryDto {
    private Double heightCm;
    private Double weightKg;
    private String bmi;
    private Double waistCircumference;
    private Double hipCircumference;
    private Double waistHipRatio;
}
