package br.com.fiap.sprint1.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name = "TB_HISTORY")
public class Pay_Hist {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_HISTORY")
    @SequenceGenerator(name = "SQ_HISTORY", sequenceName = "SQ_HISTORY", allocationSize = 1)
    @Column(name = "ID_HISTORY")
    private int id_history;

    @Column(name = "VALUE_HISTORY")
    private double value;

    @Column(name = "NFE_HISTORY")
    private byte[] nfe;

    @Column(name = "DT_PAYMENT_HISTORY")
    private LocalDate dt_payment;

    @Column(name = "DT_DUE_HISTORY")
    private LocalDate dt_due;
}
