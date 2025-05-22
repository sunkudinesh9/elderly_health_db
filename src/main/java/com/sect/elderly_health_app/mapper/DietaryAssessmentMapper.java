package com.sect.elderly_health_app.mapper;

import com.sect.elderly_health_app.Dto.DietaryAssessmentDto;
import com.sect.elderly_health_app.model.DietaryAssessment;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")

public interface DietaryAssessmentMapper {
    DietaryAssessment toEntity(DietaryAssessmentDto dietaryAssessmentDto);
    DietaryAssessmentDto toDto(DietaryAssessment dietaryAssessment);
}
