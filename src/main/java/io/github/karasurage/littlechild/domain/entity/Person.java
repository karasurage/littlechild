package io.github.karasurage.littlechild.domain.entity;
import io.github.karasurage.littlechild.domain.enums.Profile;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Person implements Serializable {

    @NotEmpty(message = "")
    @Size(min = 3, max = 20)
    private String name;

    @NotEmpty(message = "")
    @Size(min = 3, max = 50)
    @Column(name = "last_name")
    private String lastName;

    @Column(name = "date_birth")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dateBirth;

    @NotEmpty(message = "")
    private String gender;

    @CPF
    private String cpf;

    @NotEmpty(message = "")
    private String username;

    @NotEmpty(message = "")
    private String password;

    @Enumerated(EnumType.STRING)
    private Profile profile;

    private Phone phone;

    private Address adress;

}
