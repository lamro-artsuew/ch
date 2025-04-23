package com.chaosforge.intelharvester.service;

import com.chaosforge.intelharvester.domain.Insight;
import com.chaosforge.intelharvester.repository.InsightRepository;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.Map;
import java.util.UUID;

@Component
public class ChaosProcessor {

    private final GPTAnalyzer gptAnalyzer;
    private final InsightRepository insightRepository;

    public ChaosProcessor(GPTAnalyzer analyzer, InsightRepository repo) {
        this.gptAnalyzer = analyzer;
        this.insightRepository = repo;
    }

    public void process(Map<String, Object> chaos) {
        String content = chaos.get("content").toString();
        String summary = gptAnalyzer.analyze(content);
        Insight insight = new Insight(UUID.randomUUID(), "chaos-id", summary, "flag or enrich", Instant.now());
        insightRepository.save(insight);
    }
}