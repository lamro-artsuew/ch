package com.chaosforge.intelharvester.domain;

import java.time.Instant;
import java.util.UUID;

public record ChaosEvent(UUID id, String type, String rawContent, Instant timestamp) {}