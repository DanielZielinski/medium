package com.daniel.zielinski.tracedapp.infrastructure.rabbit;

import com.daniel.zielinski.tracedapp.domain.dto.Trace;
import com.daniel.zielinski.tracedapp.infrastructure.rabbit.protocol.TraceMessage;

public interface TraceSender {
    void sendTrace(TraceMessage traceMessage);
}
