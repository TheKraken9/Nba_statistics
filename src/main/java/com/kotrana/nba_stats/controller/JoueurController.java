package com.kotrana.nba_stats.controller;

import com.kotrana.nba_stats.model.Joueur;
import com.kotrana.nba_stats.model.Nba;
import com.kotrana.nba_stats.model.PlusInfo;
import com.kotrana.nba_stats.model.Rebond;
import com.kotrana.nba_stats.repository.JoueurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JoueurController {
    private final JoueurRepository joueurRepository;

    public JoueurController(JoueurRepository joueurRepository) {
        this.joueurRepository = joueurRepository;
    }

    @GetMapping("/joueurs")
    public ResponseEntity<?> getAllJoueurs() {
        List<Joueur> joueurs = joueurRepository.findAll();
        if(!joueurs.isEmpty()){
            return new ResponseEntity<List<Joueur>>(joueurs, HttpStatus.OK);
        }else{
            return new ResponseEntity<String>("No joueurs found", HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/joueur/{nom}")
    public ResponseEntity<?> getJoueurByNom(@PathVariable String nom) {
        List<Nba> joueurs = joueurRepository.findRebondsByJoueurNom(nom);
        if(!joueurs.isEmpty()){
            return new ResponseEntity<List<Nba>>(joueurs, HttpStatus.OK);
        }else{
            return new ResponseEntity<String>("No joueurs found", HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/joueur")
    public ResponseEntity<?> createJoueur(@RequestBody Joueur joueur) {
        try{
            joueurRepository.save(joueur);
            return new ResponseEntity<Joueur>(joueur, HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity<String>("Error creating joueur", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
