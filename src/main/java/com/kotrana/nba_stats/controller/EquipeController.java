package com.kotrana.nba_stats.controller;

import com.kotrana.nba_stats.model.Equipe;
import com.kotrana.nba_stats.repository.EquipeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EquipeController {
    private final EquipeRepository equipeRepository;

    public EquipeController(EquipeRepository equipeRepository) {
        this.equipeRepository = equipeRepository;
    }

    @GetMapping("/equipes")
    public ResponseEntity<?> getAllEquipes() {
        List<Equipe> equipes = equipeRepository.findAll();
        if(!equipes.isEmpty()){
            return new ResponseEntity<List<Equipe>>(equipes, HttpStatus.OK);
        }else{
            return new ResponseEntity<String>("No equipes found", HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/equipe")
    public ResponseEntity<?> createEquipe(@RequestBody Equipe equipe) {
        try{
            equipeRepository.save(equipe);
            return new ResponseEntity<Equipe>(equipe, HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity<String>("Error creating equipe", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
