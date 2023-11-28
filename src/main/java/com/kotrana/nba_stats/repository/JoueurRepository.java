package com.kotrana.nba_stats.repository;

import com.kotrana.nba_stats.model.Joueur;
import com.kotrana.nba_stats.model.Nba;
import com.kotrana.nba_stats.model.PlusInfo;
import com.kotrana.nba_stats.model.Rebond;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JoueurRepository extends MongoRepository<Joueur, String> {
    @Query(value = "{ 'nom' : ?0 }")
    List<Nba> findRebondsByJoueurNom(String nom);
}
