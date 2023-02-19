package com.daniel.zielinski.medium.tracedapp.enpoint.api;


import com.daniel.zielinski.medium.tracedapp.domain.TraceFacade;
import com.daniel.zielinski.medium.tracedapp.enpoint.api.protocol.TraceCreateRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/trace")
class TraceController {

    private final TraceFacade traceFacade;

    @PostMapping
    public void createTrace(@RequestBody TraceCreateRequest traceCreateRequest) {
        traceFacade.createTrace(traceCreateRequest);
    }

}
