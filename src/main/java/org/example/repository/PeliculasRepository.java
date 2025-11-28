package org.example.repository;

import org.example.model.peliculas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeliculasRepository extends JpaRepository<peliculas, Integer> {

}

