package com.siemens.cms.distributedtracing.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.sleuth.stream.SleuthSink;
import org.springframework.cloud.sleuth.stream.Spans;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;

@MessageEndpoint
public class MyMessageListener {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @StreamListener(SleuthSink.INPUT)
    public void sink(Spans input) {
        logger.info(input.getHost().getServiceName());
    }
}
