package com.sect.elderly_health_app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VisitSchedule {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private GramPanchayat gramPanchayat;

    private LocalDate visitDate;

    @ManyToOne
    private LoginUser teamMember;
}
