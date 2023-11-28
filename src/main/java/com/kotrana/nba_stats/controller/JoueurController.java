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

    @PutMapping("/joueur/{id}")
    public ResponseEntity<?> updateJoueur(@PathVariable String id, @RequestBody Joueur joueur) {
        try{
            Joueur joueurToUpdate = joueurRepository.findById(id).get();
            joueurToUpdate.setNom(joueur.getNom());
            joueurToUpdate.setPrenom(joueur.getPrenom());
            joueurToUpdate.setAge(joueur.getAge());
            joueurToUpdate.setTaille(joueur.getTaille());
            joueurToUpdate.setPoids(joueur.getPoids());
            joueurToUpdate.setPoste(joueur.getPoste());
            joueurToUpdate.setNumero(joueur.getNumero());
            joueurToUpdate.setEquipe(joueur.getEquipe());
            joueurToUpdate.setSalaire(joueur.getSalaire());
            joueurToUpdate.setDateNaissance(joueur.getDateNaissance());
            joueurToUpdate.setVilleNaissance(joueur.getVilleNaissance());
            joueurToUpdate.setPaysNaissance(joueur.getPaysNaissance());
            joueurToUpdate.setUniversite(joueur.getUniversite());
            joueurToUpdate.setDraft(joueur.getDraft());
            joueurToUpdate.setNbSelectionsAllStar(joueur.getNbSelectionsAllStar());
            joueurToUpdate.setUrlPhoto(joueur.getUrlPhoto());
            joueurRepository.save(joueurToUpdate);
            return new ResponseEntity<Joueur>(joueurToUpdate, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<String>("Error updating joueur", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/joueur/{id}")
    public ResponseEntity<?> deleteJoueur(@PathVariable String id) {
        try{
            joueurRepository.deleteById(id);
            return new ResponseEntity<String>("Joueur deleted", HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<String>("Error deleting joueur", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
