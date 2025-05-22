package com.sect.elderly_health_app.model;

import com.sect.elderly_health_app.enums.*;
import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.time.LocalDate;

@Entity
@Table(name = "participants")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Participant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true, nullable = false)
    private String participantId;

    @Enumerated(EnumType.STRING)
    private Cohort cohort;

    @Enumerated(EnumType.STRING)
    private GramaPanchayatas gramPanchayat;

    private String fatherName;
    private String motherName;

    @NotNull
    private LocalDate dateOfBirth;

    @NotNull
    private Integer age;

    private String occupation;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Enumerated(EnumType.STRING)
    private MaritalStatus maritalStatus;

    @Enumerated(EnumType.STRING)
    private LivingStatus livingStatus;

    @OneToOne(mappedBy = "participant", cascade = CascadeType.ALL)
    private HealthProfile healthProfile;

    @OneToOne(mappedBy = "participant", cascade = CascadeType.ALL)
    private DietaryAssessment dietaryAssessment;

    @OneToOne(mappedBy = "participant", cascade = CascadeType.ALL)
    private SocialProfile socialProfile;

    @OneToOne(mappedBy = "participant", cascade = CascadeType.ALL)
    private Anthropometry anthropometry;

    @OneToOne(mappedBy = "participant", cascade = CascadeType.ALL)
    private PhysicalActivity physicalActivity;

    @OneToOne(mappedBy = "participant", cascade = CascadeType.ALL)
    private Vitals vitals;

}
