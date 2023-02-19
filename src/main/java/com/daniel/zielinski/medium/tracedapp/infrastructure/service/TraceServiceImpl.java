package com.daniel.zielinski.medium.tracedapp.infrastructure.service;

import com.daniel.zielinski.medium.tracedapp.domain.TracePropagator;
import com.daniel.zielinski.medium.tracedapp.domain.TraceService;
import com.daniel.zielinski.medium.tracedapp.domain.TracePersistProvider;
import com.daniel.zielinski.medium.tracedapp.domain.dto.Trace;
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
