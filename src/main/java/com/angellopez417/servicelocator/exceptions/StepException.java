package com.angellopez417.servicelocator.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "step not processable.")
public class StepException extends RuntimeException {
  public StepException(String message) {
    super(message);
  }
}
