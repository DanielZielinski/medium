package com.daniel.zielinski.tracedapp.infrastructure.service;

import com.daniel.zielinski.tracedapp.domain.TracePersistProvider;
import com.daniel.zielinski.tracedapp.domain.TracePropagator;
import com.daniel.zielinski.tracedapp.domain.TraceService;
import com.daniel.zielinski.tracedapp.domain.dto.Trace;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
class TraceServiceImpl implements TraceService {

    private final TracePersistProvider tracePersistProvider;
    private final TracePropagator tracePropagator;

    @Override
    public void createTrace(Trace trace) {
        tracePersistProvider.createTrace(trace);
        tracePropagator.propagate(trace);
    }
}
