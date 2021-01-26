package io.github.karasurage.littlechild.domain.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@Table(name = "tb_user")
@EqualsAndHashCode(of = {"id"})
@AllArgsConstructor
@NoArgsConstructor
public class User extends Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "id")
    private List<EducationalInstitution> educationalInstitutions = new ArrayList<>();

    // TODO: Melhorar esse ponto do Responsável com Aluno
    @ManyToMany
    @JoinTable(name = "responsible_student",
            joinColumns = @JoinColumn(name = "responsible_user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "student_id", referencedColumnName = "id"))
    private List<Student> students;

}