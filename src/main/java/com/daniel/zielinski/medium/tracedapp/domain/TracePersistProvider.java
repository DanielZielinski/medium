package com.daniel.zielinski.medium.tracedapp.domain;

import com.daniel.zielinski.medium.tracedapp.domain.dto.Trace;

public interface TracePersistProvider {

    void createTrace(Trace trace);
}
