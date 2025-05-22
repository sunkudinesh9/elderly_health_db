package com.sect.elderly_health_app.mapper;

import com.sect.elderly_health_app.Dto.ParticipantDto;
import com.sect.elderly_health_app.model.Participant;
import org.mapstruct.*;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.ERROR, uses = {
        HealthProfileMapper.class,
        DietaryAssessmentMapper.class,
        SocialProfileMapper.class,
        AnthropometryMapper.class,
        PhysicalActivityMapper.class,
        VitalsMapper.class,

})
public interface ParticipantMapper {
    @Mapping(target = "id", ignore = true) // usually, id is generated, so ignore it
    @Mapping(source = "healthProfileDto", target = "healthProfile")
    @Mapping(source = "dietaryAssessmentDto", target = "dietaryAssessment")
    @Mapping(source = "socialProfileDto", target = "socialProfile")
    @Mapping(source = "anthropometryDto", target = "anthropometry")
    @Mapping(source = "physicalActivityDto", target = "physicalActivity")
    @Mapping(source = "vitalsDto", target = "vitals")
    Participant toEntity(ParticipantDto participantDto);

    @Mapping(source = "healthProfile", target = "healthProfileDto")
    @Mapping(source = "dietaryAssessment", target = "dietaryAssessmentDto")
    @Mapping(source = "socialProfile", target = "socialProfileDto")
    @Mapping(source = "anthropometry", target = "anthropometryDto")
    @Mapping(source = "physicalActivity", target = "physicalActivityDto")
    @Mapping(source = "vitals", target = "vitalsDto")
    ParticipantDto toDto(Participant participant);

}
