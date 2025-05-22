package com.sect.elderly_health_app.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "social_profiles")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SocialProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "participant_id", nullable = false, unique = true)
    private Participant participant;

    private String participationCommunity;

    private String encouragedByFamily;

    private String socialParticipationImpact;

    private String socialInteractionBarriers;

    private String lonelinessFrequency;

    private String hasSupport;
}
