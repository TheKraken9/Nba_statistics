package com.kotrana.nba_stats.controller;

import com.kotrana.nba_stats.model.Nba;
import com.kotrana.nba_stats.repository.NbaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ResultatParMatch {
    private final NbaRepository nbaRepository;

    public ResultatParMatch(NbaRepository nbaRepository) {
        this.nbaRepository = nbaRepository;
    }

    @GetMapping("/resultat")
    public ResponseEntity<?> getResultatParMatch() {
        List<Nba> nba = nbaRepository.findAll();
        if(nba.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(nba);
    }
}
