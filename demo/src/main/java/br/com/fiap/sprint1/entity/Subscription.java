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
@Table(name = "TB_SUBSCRIPTION")
public class Subscription {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_SUBSCRIPTION")
    @SequenceGenerator(name = "SQ_SUBSCRIPTION", sequenceName = "SQ_SUBSCRIPTION", allocationSize = 1)
    @Column(name = "ID_SUBSCRIPTION")
    private int id_subscription;

    @Column(name = "VALUE_SUBSCRIPTION")
    private double value;

    @Column(name = "STATUS_SUBSCRIPTION")
    private String status;

    @Column(name = "DT_START_SUBSCRIPTION")
    private LocalDate dt_start;

    @Column(name = "DT_END_SUBSCRIPTION")
    private LocalDate dt_end;

}
