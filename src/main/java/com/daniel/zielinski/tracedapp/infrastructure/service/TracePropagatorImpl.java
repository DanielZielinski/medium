package com.daniel.zielinski.tracedapp.infrastructure.service;

import com.daniel.zielinski.tracedapp.domain.TracePropagator;
import com.daniel.zielinski.tracedapp.domain.dto.Trace;
import com.daniel.zielinski.tracedapp.infrastructure.mapper.TraceMapper;
import com.daniel.zielinski.tracedapp.infrastructure.rabbit.TraceSender;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
class TracePropagatorImpl implements TracePropagator {

    private final TraceSender traceSender;

    @Override
    public void propagate(Trace trace) {
        traceSender.sendTrace(TraceMapper.INSTANCE.map(trace));
    }
}
