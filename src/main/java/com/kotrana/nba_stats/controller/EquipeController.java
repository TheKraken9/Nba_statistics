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

    @PutMapping("/equipe/{id}")
public ResponseEntity<?> updateEquipe(@PathVariable String id, @RequestBody Equipe equipe) {
        try{
            Equipe equipeToUpdate = equipeRepository.findById(id).get();
            equipeToUpdate.setNom(equipe.getNom());
            equipeToUpdate.setVille(equipe.getVille());
            equipeToUpdate.setConference(equipe.getConference());
            equipeToUpdate.setDivision(equipe.getDivision());
            equipeToUpdate.setUrlLogo(equipe.getUrlLogo());
            equipeRepository.save(equipeToUpdate);
            return new ResponseEntity<Equipe>(equipeToUpdate, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<String>("Error updating equipe", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/equipe/{id}")
    public ResponseEntity<?> deleteEquipe(@PathVariable String id) {
        try{
            equipeRepository.deleteById(id);
            return new ResponseEntity<String>("Equipe deleted", HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<String>("Error deleting equipe", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
