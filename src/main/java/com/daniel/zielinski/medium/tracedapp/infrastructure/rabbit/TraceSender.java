package com.daniel.zielinski.medium.tracedapp.infrastructure.rabbit;

import com.daniel.zielinski.medium.tracedapp.infrastructure.rabbit.protocol.TraceMessage;

public interface TraceSender {
    void sendTrace(TraceMessage traceMessage);
}
