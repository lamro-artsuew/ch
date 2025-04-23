package com.chaosforge.intelharvester.domain;

import java.time.Instant;
import java.util.UUID;

public record Insight(UUID id, String chaosId, String gptSummary, String nextAction, Instant generatedAt) {}