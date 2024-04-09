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
@Table(name = "TB_PROFILE")
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_PROFILE")
    @SequenceGenerator(name = "SQ_PROFILE", sequenceName = "SQ_PROFILE", allocationSize = 1)
    @Column(name = "ID_USER")
    private int id_user;

    @Column(name = "NM_USER")
    private String nm_user;

    @Column(name = "PASS_USER")
    private String pass_user;

    @Column(name = "PERM_USER")
    private String permission;

    @Column(name = "STATUS_USER")
    private String status;

    @Column(name = "DT_REGISTER_USER")
    private LocalDate dt_register;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(
            name = "COMPANY",
            referencedColumnName = "ID_COMPANY",
            foreignKey = @ForeignKey(
                    name = "FK_COMPANY_PROFILE"
            )
    )
    private Company id_company;

}
