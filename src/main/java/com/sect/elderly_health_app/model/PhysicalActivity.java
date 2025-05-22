package com.sect.elderly_health_app.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "physical_activities")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PhysicalActivity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "participant_id", nullable = false, unique = true)
    private Participant participant;

    @ElementCollection
    @CollectionTable(name = "activity_list", joinColumns = @JoinColumn(name = "activity_id"))
    @Column(name = "activity_name")
    private List<String> activities;

    private String tobaccoUse;

    private String alcoholConsumption;
}
