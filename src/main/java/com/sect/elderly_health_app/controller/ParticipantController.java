package com.sect.elderly_health_app.controller;

import com.sect.elderly_health_app.Dto.ApiResponse;
import com.sect.elderly_health_app.Dto.ParticipantDto;
import com.sect.elderly_health_app.service.ParticipantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/participant")
public class ParticipantController {

    @Autowired
    private ParticipantService participantService;

    @PostMapping("create")
    public ResponseEntity<ApiResponse<ParticipantDto>> createParticipant(@RequestBody ParticipantDto participantDto) {
        ParticipantDto participant = participantService.createParticipant(participantDto);
        return new ResponseEntity<>(
                new ApiResponse<>(participant, LocalDateTime.now(), "Participant has been created"),
                HttpStatus.CREATED);
    }

    @GetMapping("/{participantId}")
    public ResponseEntity<ParticipantDto> getParticipantByParticipantId(@PathVariable("participantId") String participantId) {
        return new ResponseEntity<>(participantService.findByParticipantId(participantId), HttpStatus.OK);
    }

}
