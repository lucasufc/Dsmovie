package com.lucasmartins.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasmartins.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
