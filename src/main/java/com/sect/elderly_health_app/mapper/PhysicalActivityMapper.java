package com.sect.elderly_health_app.mapper;

import com.sect.elderly_health_app.Dto.PhysicalActivityDto;
import com.sect.elderly_health_app.model.PhysicalActivity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PhysicalActivityMapper {
    PhysicalActivity toEntity(PhysicalActivityDto physicalActivityDto);
    PhysicalActivityDto toDto(PhysicalActivity physicalActivity);
}
