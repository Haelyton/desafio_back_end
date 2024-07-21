package com.maicon_projeto_back.desafio_back_end.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.maicon_projeto_back.desafio_back_end.entity.ContaBancaria;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryContaBancaria extends JpaRepository<ContaBancaria, Long> {


}