package com.sect.elderly_health_app.repository;

import com.sect.elderly_health_app.model.Participant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParticipantRepository extends JpaRepository<Participant, Integer> {
    Participant findByParticipantId(String participantId);
}
