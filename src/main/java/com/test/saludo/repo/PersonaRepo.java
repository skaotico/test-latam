package com.test.saludo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.saludo.dto.Persona;

@Repository
public interface PersonaRepo extends JpaRepository<Persona, Long> {

}
