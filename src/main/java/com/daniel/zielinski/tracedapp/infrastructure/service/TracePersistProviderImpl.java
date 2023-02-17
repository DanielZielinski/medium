package com.daniel.zielinski.tracedapp.infrastructure.service;

import com.daniel.zielinski.tracedapp.domain.TracePersistProvider;
import com.daniel.zielinski.tracedapp.domain.dto.Trace;
import com.daniel.zielinski.tracedapp.infrastructure.mapper.TraceMapper;
import com.daniel.zielinski.tracedapp.infrastructure.model.TraceJpaRepository;
import com.daniel.zielinski.tracedapp.infrastructure.model.TraceMongoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
class TracePersistProviderImpl implements TracePersistProvider {

    private final TraceMongoRepository traceMongoRepository;
    private final TraceJpaRepository traceJpaRepository;

    @Override
    public void createTrace(Trace trace) {
        traceMongoRepository.save(TraceMapper.INSTANCE.mapToDocument(trace));
        traceJpaRepository.save(TraceMapper.INSTANCE.mapToEntity(trace));
    }
}
