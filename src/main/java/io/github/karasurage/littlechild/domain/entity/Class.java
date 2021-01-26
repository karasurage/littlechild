package io.github.karasurage.littlechild.domain.entity;

import io.github.karasurage.littlechild.domain.enums.Shift;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@Table(name = "tb_class")
@EqualsAndHashCode(of = {"id"})
@AllArgsConstructor
@NoArgsConstructor
public class Class {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "age_range")
    private String ageRange;

    @Enumerated(EnumType.STRING)
    private Shift shift;

    @ManyToOne
    @JoinColumn(name = "education_institution_id")
    private EducationalInstitution educationalInstitution;

/*    @ManyToMany
    @JoinTable(name = "turma_professor",
            joinColumns = @JoinColumn(name = "cd_turma_fk", referencedColumnName = "cd_turma"),
            inverseJoinColumns = @JoinColumn(name = "cd_professor_fk", referencedColumnName = "cd_professor"))
    private List<Professor> professores = new ArrayList<>();*/

    @OneToMany(mappedBy = "id")
    private List<Student> students = new ArrayList<>();

}
