package com.daniel.zielinski.medium.tracedapp.infrastructure.service;

import com.daniel.zielinski.medium.tracedapp.domain.TracePropagator;
import com.daniel.zielinski.medium.tracedapp.domain.dto.Trace;
import com.daniel.zielinski.medium.tracedapp.infrastructure.mapper.TraceMapper;
import com.daniel.zielinski.medium.tracedapp.infrastructure.rabbit.TraceSender;
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
