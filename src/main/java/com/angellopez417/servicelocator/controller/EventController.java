package com.angellopez417.servicelocator.controller;

import com.angellopez417.servicelocator.dto.EventDataDto;
import com.angellopez417.servicelocator.service.EventExecutorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class EventController {

  private final EventExecutorService eventExecutorService;

  @PostMapping("/")
  public ResponseEntity<String> proccessMessage(@RequestBody EventDataDto eventDataDto) {
    return ResponseEntity.ok(eventExecutorService.processMessage(eventDataDto.getEventName(), eventDataDto.getData()));
  }
}
