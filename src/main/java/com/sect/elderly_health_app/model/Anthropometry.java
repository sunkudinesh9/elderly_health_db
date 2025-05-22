package com.sect.elderly_health_app.model;

import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "anthropometries")
public class Anthropometry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "participant_id", nullable = false)
    private Participant participant;

    private Double heightCm;

    @NotNull
    private Double weightKg;

    private String bmi;

    @NotNull
    private Double waistCircumference;

    @NotNull
    private Double hipCircumference;

    @NotNull
    private Double waistHipRatio;
}
