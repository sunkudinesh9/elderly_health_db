package com.sect.elderly_health_app.mapper;

import com.sect.elderly_health_app.Dto.VitalsDto;
import com.sect.elderly_health_app.model.Vitals;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface VitalsMapper {
    Vitals toEntity(VitalsDto vitalsDto);

    VitalsDto toDto(Vitals vitals);
}
