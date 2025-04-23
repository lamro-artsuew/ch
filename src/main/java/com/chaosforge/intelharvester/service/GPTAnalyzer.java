package com.chaosforge.intelharvester.service;

import org.springframework.stereotype.Component;

@Component
public class GPTAnalyzer {
    public String analyze(String input) {
        return "GPT says: " + input.substring(0, Math.min(50, input.length())) + "...";
    }
}