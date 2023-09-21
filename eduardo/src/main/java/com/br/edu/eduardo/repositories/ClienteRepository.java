package com.br.edu.eduardo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.edu.eduardo.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
