package com.angellopez417.servicelocator.event;

import java.util.Map;
import org.springframework.stereotype.Component;

@Component(ScanLocation.name)
public class ScanLocation implements Event<String> {

  public static final String name = "scan-location";

  @Override
  public String process(String data) {
    return String.format("scan-location with string value: %s", data);
  }
}
