package com.sect.elderly_health_app.mapper;

import com.sect.elderly_health_app.Dto.SocialProfileDto;
import com.sect.elderly_health_app.model.SocialProfile;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SocialProfileMapper {
    SocialProfile toEntity(SocialProfileDto socialProfileDto);
    SocialProfileDto toDto(SocialProfile socialProfile);
}
