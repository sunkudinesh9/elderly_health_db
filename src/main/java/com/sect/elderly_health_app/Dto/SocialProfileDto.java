package com.sect.elderly_health_app.Dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SocialProfileDto {
    private String participationCommunity;
    private String encouragedByFamily;
    private String socialParticipationImpact;
    private String socialInteractionBarriers;
    private String lonelinessFrequency;
    private String hasSupport;
}
