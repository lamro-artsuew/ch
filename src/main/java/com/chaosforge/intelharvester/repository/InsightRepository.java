package com.chaosforge.intelharvester.repository;

import com.chaosforge.intelharvester.domain.Insight;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class InsightRepository {

    private final List<Insight> db = new ArrayList<>();

    public void save(Insight insight) {
        db.add(insight);
    }

    public List<Insight> findByChaosId(String chaosId) {
        return db.stream()
                .filter(i -> i.chaosId().equalsIgnoreCase(chaosId))
                .collect(Collectors.toList());
    }

    public List<Insight> findAll() {
        return db;
    }
}