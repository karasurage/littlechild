package io.github.karasurage.littlechild.domain.entity;

import lombok.*;
import org.hibernate.validator.constraints.br.CNPJ;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@Table(name = "tb_educational_institution")
@EqualsAndHashCode(of = {"id"})
@AllArgsConstructor
@NoArgsConstructor
public class EducationalInstitution {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CNPJ
    private String cnpj;

    @Column(name = "social_reason")
    private String socialReason;

    @Column(name = "fantasy_name")
    private String fantasyName;

    private Address address;

    @OneToMany(mappedBy = "id")
    private List<Class> classes = new ArrayList<>();

//    @OneToMany(mappedBy = "id")
//    private List<Professor> professores = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User users;

}