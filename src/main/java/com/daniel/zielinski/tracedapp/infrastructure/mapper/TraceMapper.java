package com.daniel.zielinski.tracedapp.infrastructure.mapper;


import com.daniel.zielinski.tracedapp.domain.dto.Trace;
import com.daniel.zielinski.tracedapp.enpoint.api.protocol.TraceCreateRequest;
import com.daniel.zielinski.tracedapp.infrastructure.model.TraceDocument;
import com.daniel.zielinski.tracedapp.infrastructure.model.TraceEntity;
import com.daniel.zielinski.tracedapp.infrastructure.rabbit.protocol.TraceMessage;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.ERROR)
@SuppressWarnings("java:S1214")
public interface TraceMapper {

    TraceMapper INSTANCE = Mappers.getMapper(TraceMapper.class);

    @Mapping(target = "id", ignore = true)
    Trace map(TraceCreateRequest traceCreateRequest);

    @Mapping(target = "id", ignore = true)
    TraceDocument mapToDocument(Trace trace);

    @Mapping(target = "id", ignore = true)
    TraceEntity mapToEntity(Trace trace);

    TraceMessage map(Trace trace);
}
