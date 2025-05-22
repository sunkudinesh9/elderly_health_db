package com.sect.elderly_health_app.mapper;

import com.sect.elderly_health_app.Dto.AnthropometryDto;
import com.sect.elderly_health_app.model.Anthropometry;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AnthropometryMapper {
    Anthropometry toEntity(AnthropometryDto anthropometryDto);
    AnthropometryDto toDto(Anthropometry anthropometry);
}
