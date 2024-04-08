package br.com.fiap.sprint1.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name = "TB_HIST_PAG")
public class Hist_Pag {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_HIST_PAG")
    @SequenceGenerator(name = "SQ_HIST_PAG", sequenceName = "SQ_HIST_PAG", allocationSize = 1)
    @Column(name = "ID_HIST_PAG")

    private int id_historico;

    private double valor;

    private String dt_pagamento;

    private String dt_vencimento;

    private byte[] nfe;
}
