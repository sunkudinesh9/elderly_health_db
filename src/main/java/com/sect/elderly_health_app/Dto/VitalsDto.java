package com.sect.elderly_health_app.Dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VitalsDto {
    private String bloodPressure;
    private Double randomBloodSugar;
    private Integer pulseRate;
}
