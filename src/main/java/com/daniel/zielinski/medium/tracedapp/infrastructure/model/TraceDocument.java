package com.daniel.zielinski.medium.tracedapp.infrastructure.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "trace")
public class TraceDocument {

    @Id
    private String id;
    private String name;
}
