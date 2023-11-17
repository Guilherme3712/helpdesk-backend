package com.sistema.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistema.helpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
