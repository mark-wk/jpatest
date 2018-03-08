package com.artivr.web.service.serviceImpl;

import org.ehcache.event.CacheEvent;
import org.ehcache.event.CacheEventListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EventLoggerService implements CacheEventListener<Object,Object> {
    private static final Logger LOGGER = LoggerFactory.getLogger(EventLoggerService.class);

    @Override
    public void onEvent(CacheEvent<? extends Object, ? extends Object> cacheEvent) {
        LOGGER.error("Event: " + cacheEvent.getType() + " Key: " + cacheEvent.getKey() + " old value: " + cacheEvent.getOldValue()
                + " new value: " + cacheEvent.getNewValue());
    }
}
