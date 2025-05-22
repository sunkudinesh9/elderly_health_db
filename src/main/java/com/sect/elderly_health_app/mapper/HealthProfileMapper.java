package com.sect.elderly_health_app.mapper;

import com.sect.elderly_health_app.Dto.HealthProfileDto;
import com.sect.elderly_health_app.model.HealthProfile;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface HealthProfileMapper {
    HealthProfile toEntity(HealthProfileDto dto);
    HealthProfileDto toDto(HealthProfile entity);
}
