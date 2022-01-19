package com.projects.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projects.dsmovie.entities.Score;
import com.projects.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
