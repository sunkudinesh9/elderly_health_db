package com.sect.elderly_health_app.Dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PhysicalActivityDto {
    private List<String> activities;
    private String tobaccoUse;
    private String alcoholConsumption;
}
