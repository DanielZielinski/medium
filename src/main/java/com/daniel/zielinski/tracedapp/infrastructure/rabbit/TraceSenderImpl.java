package com.daniel.zielinski.tracedapp.infrastructure.rabbit;

import com.daniel.zielinski.tracedapp.infrastructure.rabbit.protocol.TraceMessage;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
@EnableBinding(RabbitMqChannels.class)
class TraceSenderImpl implements TraceSender {

    private final RabbitMqChannels rabbitMqChannels;

    @Override
    public void sendTrace(TraceMessage traceMessage) {
        log.info("Send trace message: {}", traceMessage);
        rabbitMqChannels.traceProducer().send(MessageBuilder.withPayload(traceMessage).build());
    }
}
