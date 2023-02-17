package com.daniel.zielinski.tracedapp.infrastructure.rabbit;


import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.SubscribableChannel;

public interface RabbitMqChannels {

    String TRACE_PRODUCER = "trace-producer";
    String TRACE_CONSUMER = "trace-consumer";

    @Output(TRACE_PRODUCER)
    SubscribableChannel traceProducer();

    @Input(TRACE_CONSUMER)
    SubscribableChannel traceConsumer();
}
