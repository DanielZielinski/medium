package com.daniel.zielinski.medium.tracedapp.domain;

import com.daniel.zielinski.medium.tracedapp.enpoint.api.protocol.TraceCreateRequest;
import com.daniel.zielinski.medium.tracedapp.infrastructure.mapper.TraceMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TraceFacade {

    private final TraceService traceService;

    public void createTrace(TraceCreateRequest traceCreateRequest) {
        traceService.createTrace(TraceMapper.INSTANCE.map(traceCreateRequest));
    }
}
