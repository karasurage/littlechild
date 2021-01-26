package io.github.karasurage.littlechild.domain.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@Table(name = "tb_student")
@EqualsAndHashCode(of = {"id"})
@AllArgsConstructor
@NoArgsConstructor
public class Student extends Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "father_name")
    private String fatherName;

    @Column(name = "nome_mae")
    private String motherName;

    @Column(name = "first_authorized_person")
    private String firstAuthorizedPerson;

    @Column(name = "second_authorized_person")
    private String secondAuthorizedPerson;

    @Column(name = "food_allergy")
    private String foodAllergy;

    @Column(name = "allergy_medication")
    private String allergyMedication;

    @Column(name = "like_play")
    private String likePlay;

    @Column(name = "special_need")
    private String specialNeed;

    @Column(name = "behavioral_profile")
    private String behavioralProfile;

/*    @ManyToMany(fetch = FetchType.LAZY)
    private List<Responsavel> responsaveis = new ArrayList<>();*/

    @ManyToOne
    @JoinColumn(name = "class_id")
    private Class classes;

    @OneToOne
    @MapsId
    private Diary diary;

    @ManyToMany
    private List<User> users;

}
