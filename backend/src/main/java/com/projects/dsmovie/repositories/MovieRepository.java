package com.projects.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projects.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
