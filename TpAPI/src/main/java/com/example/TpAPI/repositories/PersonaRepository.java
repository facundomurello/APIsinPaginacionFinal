package com.example.TpAPI.repositories;

import com.example.TpAPI.entities.Persona;
import org.springframework.stereotype.Repository;

@Repository

public interface PersonaRepository extends BaseRepository<Persona, Long> {
}