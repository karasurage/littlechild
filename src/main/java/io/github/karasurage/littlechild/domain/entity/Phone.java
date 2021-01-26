package io.github.karasurage.littlechild.domain.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Getter
@Setter
@ToString
@Table(name = "tb_phone")
@EqualsAndHashCode(of = {"id"})
@AllArgsConstructor
@NoArgsConstructor
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "")
    @Size(max = 2)
    private String ddd;

    @NotEmpty(message = "")
    private String phone;

    @NotEmpty(message = "")
    @Column(name = "cell_phone")
    private String cellPhone;

    @NotEmpty(message = "")
    @Column(name = "whatsapp")
    private boolean isWhatsapp;

}


