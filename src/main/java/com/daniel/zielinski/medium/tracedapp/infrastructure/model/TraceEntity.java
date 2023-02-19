package com.daniel.zielinski.medium.tracedapp.infrastructure.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity(name = "trace")
public class TraceEntity {

    private static final String TRACE_SEQ = "trace_seq";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = TRACE_SEQ)
    @GenericGenerator(name = TRACE_SEQ,
            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = SequenceStyleGenerator.SEQUENCE_PARAM, value = TRACE_SEQ),
                    @Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "50")
            })
    @Setter(value = AccessLevel.NONE)
    @Column(name = "trace_id")
    private Long id;
    private String name;
}
