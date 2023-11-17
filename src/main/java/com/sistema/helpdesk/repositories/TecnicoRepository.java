package com.sistema.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistema.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {

}
