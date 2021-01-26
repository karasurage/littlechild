package io.github.karasurage.littlechild.domain.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Getter
@Setter
@ToString
@Table(name = "tb_address")
@EqualsAndHashCode(of = {"id"})
@AllArgsConstructor
@NoArgsConstructor
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "")
    private String street;

    @NotEmpty(message = "")
    private String number;

    @NotEmpty(message = "")
    private String district;

    @Size(max = 2)
    @NotEmpty(message = "")
    private String uf;

    @NotEmpty(message = "")
    @Size(max = 8)
    @Column(name = "zip_code")
    private String zipCode;
}
