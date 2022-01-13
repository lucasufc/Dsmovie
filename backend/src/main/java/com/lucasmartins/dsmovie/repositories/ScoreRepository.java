package com.lucasmartins.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasmartins.dsmovie.entities.Score;
import com.lucasmartins.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
