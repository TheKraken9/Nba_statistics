package com.kotrana.nba_stats.repository;

import com.kotrana.nba_stats.model.Nba;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NbaRepository extends MongoRepository<Nba, String> {

}
