package com.chaosforge.intelharvester.api;

import com.chaosforge.intelharvester.service.ChaosProcessor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/chaos")
public class ChaosController {

    private final ChaosProcessor chaosProcessor;

    public ChaosController(ChaosProcessor chaosProcessor) {
        this.chaosProcessor = chaosProcessor;
    }

    @PostMapping("/ingest")
    public ResponseEntity<String> ingest(@RequestBody Map<String, Object> chaos) {
        chaosProcessor.process(chaos);
        return ResponseEntity.accepted().body("Ingested chaos.");
    }
}