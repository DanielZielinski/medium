package com.daniel.zielinski.tracedapp.domain;

import com.daniel.zielinski.tracedapp.domain.dto.Trace;

public interface TracePersistProvider {

    void createTrace(Trace trace);
}
