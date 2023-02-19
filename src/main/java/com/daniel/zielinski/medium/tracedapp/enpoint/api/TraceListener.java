package com.daniel.zielinski.medium.tracedapp.enpoint.api;

import com.daniel.zielinski.medium.tracedapp.infrastructure.rabbit.RabbitMqChannels;
import com.daniel.zielinski.medium.tracedapp.infrastructure.rabbit.protocol.TraceMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
class TraceListener {

    @StreamListener(RabbitMqChannels.TRACE_CONSUMER)
    public void receiveTrace(TraceMessage traceMessage) {
        log.info("I received message with trace: {}", traceMessage);
    }
}
