package com.angellopez417.servicelocator.event;


public interface Event<T> {

  String process(T data);
}
