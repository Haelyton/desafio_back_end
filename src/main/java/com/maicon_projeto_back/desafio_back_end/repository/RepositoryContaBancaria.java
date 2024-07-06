package com.maicon_projeto_back.desafio_back_end.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.maicon_projeto_back.desafio_back_end.entity.ContaBancaria;

public interface RepositoryContaBancaria extends JpaRepository<ContaBancaria, Long> {

}