package com.sect.elderly_health_app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GramPanchayat {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String district;
}
