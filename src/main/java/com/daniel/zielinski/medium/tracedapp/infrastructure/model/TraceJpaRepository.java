package com.daniel.zielinski.medium.tracedapp.infrastructure.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TraceJpaRepository extends JpaRepository<TraceEntity, Long> {
}
