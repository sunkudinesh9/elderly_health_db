package com.sect.elderly_health_app.service;

import com.sect.elderly_health_app.Dto.ParticipantDto;

public interface ParticipantService {
    ParticipantDto createParticipant(ParticipantDto participantDto);
    ParticipantDto findByParticipantId(String participantId);
}
