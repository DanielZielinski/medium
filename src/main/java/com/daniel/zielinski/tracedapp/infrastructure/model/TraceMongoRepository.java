package com.daniel.zielinski.tracedapp.infrastructure.model;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TraceMongoRepository extends MongoRepository<TraceDocument, String> {
}
