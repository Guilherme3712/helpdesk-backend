package com.sistema.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistema.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {

}
