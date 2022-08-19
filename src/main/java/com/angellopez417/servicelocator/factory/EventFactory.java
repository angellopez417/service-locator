package com.angellopez417.servicelocator.factory;

import com.angellopez417.servicelocator.event.Event;

public interface EventFactory {
    Event getEvent(String eventName);
}
