package com.maicon_projeto_back.desafio_back_end.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "Transferencia")
public class Transferencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;


    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "contaEmitente")
    private ContaBancaria contaEmitente;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "contaRecebimento")
    private ContaBancaria contaRecebimento;


    @JoinColumn(name = "BigDecimal")
    private BigDecimal valor = BigDecimal.ZERO;
}
