package com.angellopez417.servicelocator.dto;

import java.util.Map;
import java.util.Objects;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author alopezmartin
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EventDataDto {
  private String eventName;
  private Map<String, Object> data;
}
