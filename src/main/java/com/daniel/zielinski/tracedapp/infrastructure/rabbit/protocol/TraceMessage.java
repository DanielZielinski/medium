package com.daniel.zielinski.tracedapp.infrastructure.rabbit.protocol;

import lombok.Data;

@Data
public class TraceMessage {

    private String id;
    private String name;
}
