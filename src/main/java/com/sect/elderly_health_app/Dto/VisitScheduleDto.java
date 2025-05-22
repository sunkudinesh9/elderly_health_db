package com.sect.elderly_health_app.Dto;

import com.sect.elderly_health_app.model.LoginUser;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VisitScheduleDto {
    private GramPanchayatDto gramPanchayatDto;
    private LocalDate visitDate;
    private LoginUser teamMember;
}
