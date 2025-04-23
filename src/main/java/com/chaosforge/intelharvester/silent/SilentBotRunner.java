package com.chaosforge.intelharvester.silent;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SilentBotRunner {

    @Scheduled(fixedRate = 10000)
    public void runBackgroundTasks() {
        System.out.println("Silent bot running... chaos processed.");
    }
}