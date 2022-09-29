package com.angellopez417.servicelocator.service;

import com.angellopez417.servicelocator.exceptions.StepException;
import com.angellopez417.servicelocator.factory.EventFactory;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EventExecutorService {

  private final EventFactory eventFactory;

  public String processMessage(String eventName, Map<String, Object> data) {
    try {
      return eventFactory.getEvent(eventName).process(data.get("value"));

    } catch (Exception e) {
      throw new StepException("eventName");
    }
  }

}
