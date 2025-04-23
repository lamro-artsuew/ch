package com.chaosforge.intelharvester.api;

import com.chaosforge.intelharvester.domain.Insight;
import com.chaosforge.intelharvester.repository.InsightRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/insights")
public class InsightController {

    private final InsightRepository insightRepository;

    public InsightController(InsightRepository insightRepository) {
        this.insightRepository = insightRepository;
    }

    @GetMapping("/{chaosId}")
    public ResponseEntity<List<Insight>> getInsights(@PathVariable String chaosId) {
        return ResponseEntity.ok(insightRepository.findByChaosId(chaosId));
    }

    @GetMapping
    public ResponseEntity<List<Insight>> getInsights() {
        return ResponseEntity.ok(insightRepository.findAll());
    }
}