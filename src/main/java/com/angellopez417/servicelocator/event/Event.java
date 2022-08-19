package com.angellopez417.servicelocator.event;

import java.util.Map;

public interface Event<T> {

  String process(T data);
}
