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
@Table(name = "TB_CAMPANHA")
public class Campanha {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_CAMPANHA")
    @SequenceGenerator(name = "SQ_CAMPANHA", sequenceName = "SQ_CAMPANHA", allocationSize = 1)
    @Column(name = "ID_CAMPANHA")

    private int id_campanha;

    private String nm_campanha;

    private String target;

    private String dt_cadastro;

    private byte[] details;

    private String status;

    private Empresa id_empresa;

    private Produto id_produto;
}
