package com.daniel.zielinski.tracedapp.domain;

import com.daniel.zielinski.tracedapp.domain.dto.Trace;

public interface TracePropagator {
    
    void propagate(Trace trace);
}
