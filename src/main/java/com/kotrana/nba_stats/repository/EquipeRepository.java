package com.kotrana.nba_stats.repository;

import com.kotrana.nba_stats.model.Equipe;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EquipeRepository extends MongoRepository<Equipe, String> {
}
