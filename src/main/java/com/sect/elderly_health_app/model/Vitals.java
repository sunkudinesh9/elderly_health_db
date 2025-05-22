package com.sect.elderly_health_app.model;

import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Table(name = "vitals")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Vitals {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "participant_id", nullable = false, unique = true)
    private Participant participant;

    private String bloodPressure;

    @NotNull
    private Double randomBloodSugar;

    @NotNull
    private Integer pulseRate;
}
