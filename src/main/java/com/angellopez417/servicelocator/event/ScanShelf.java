package com.angellopez417.servicelocator.event;

import org.springframework.stereotype.Component;

@Component(ScanShelf.name)
public class ScanShelf implements Event<Integer> {

  public static final String name = "scan-shelf";

  @Override
  public String process(Integer data) {
    return String.format("scan-shelf with integer value: %d", data);
  }
}
