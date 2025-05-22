package com.sect.elderly_health_app.service.impl;

import com.sect.elderly_health_app.Dto.ParticipantDto;
import com.sect.elderly_health_app.mapper.ParticipantMapper;
import com.sect.elderly_health_app.model.Participant;
import com.sect.elderly_health_app.repository.ParticipantRepository;
import com.sect.elderly_health_app.service.ParticipantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParticipantServiceImpl implements ParticipantService {

    @Autowired
    private ParticipantRepository participantRepository;

    @Autowired
    private ParticipantMapper participantMapper;

    @Override
    public ParticipantDto createParticipant(ParticipantDto participantDto) {
        Participant participantEntity = participantMapper.toEntity(participantDto);
        participantEntity.getAnthropometry().setParticipant(participantEntity);
        participantEntity.getPhysicalActivity().setParticipant(participantEntity);
        participantEntity.getSocialProfile().setParticipant(participantEntity);
        participantEntity.getVitals().setParticipant(participantEntity);
        participantEntity.getSocialProfile().setParticipant(participantEntity);
        participantEntity.getDietaryAssessment().setParticipant(participantEntity);
        return participantMapper.toDto(participantRepository.save(participantEntity));
    }

    @Override
    public ParticipantDto findByParticipantId(String participantId) {
        Participant participant = participantRepository.findByParticipantId(participantId);
        return participantMapper.toDto(participant);
    }
}
