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
@Table(name = "TB_CAMPAIGN")
public class Campaign {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_COMPAIGN")
    @SequenceGenerator(name = "SQ_COMPAIGN", sequenceName = "SQ_COMPAIGN", allocationSize = 1)
    @Column(name = "ID_COMPAIGN")
    private int  id_compaign;

    @Column(name = "NM_CAMPAIGN")
    private String nm_campaign;

    @Column(name = "TARGET_CAMPAIGN")
    private String target;

    @Column(name = "DETAILS_CAMPAIGN")
    private byte[] details;

    @Column(name = "STATUS_CAMPAIGN")
    private String status;

    @Column(name = "DT_REGISTER_CAMPAIGN")
    private LocalDate dt_register;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(
            name = "PRODUCT",
            referencedColumnName = "ID_PRODUCT",
            foreignKey = @ForeignKey(
                    name = "FK_CAMPAIGN_PRODUCT"
            )
    )
    private Product id_product;

}
