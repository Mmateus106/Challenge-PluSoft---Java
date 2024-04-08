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
@Table(name = "TB_ASSINATURA")
public class Assinatura {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_ASSINATURA")
    @SequenceGenerator(name = "SQ_ASSINATURA", sequenceName = "SQ_ASSINATURA", allocationSize = 1)
    @Column(name = "ID_ASSINATURA")

    private int id_assinatura;

    private double valor;

    private String dt_start;

    private String dt_end;

    private String status;

    private Hist_Pag id_historico;

    private Empresa id_empresa;
}
