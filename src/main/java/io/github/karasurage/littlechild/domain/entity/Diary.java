package io.github.karasurage.littlechild.domain.entity;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@Table(name = "tb_diary")
@EqualsAndHashCode(of = {"id"})
@AllArgsConstructor
@NoArgsConstructor
public class Diary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Column(name = "diary_date")
    private LocalDate diaryDate;

    @Temporal(TemporalType.TIME)
    @DateTimeFormat(pattern = "HH:mm")
    @Column(name = "check_in")
    private LocalTime checkIn;

    @Temporal(TemporalType.TIME)
    @DateTimeFormat(pattern = "HH:mm")
    @Column(name = "check_out")
    private LocalTime checkOut;

    @Size(min = 3, max = 500)
    @Column(name = "occurrence_diary")
    private String occurrenceDiary;

    @Size(min = 3, max = 500)
    private String notification;

    @OneToMany(mappedBy = "id")
    private List<Bath> baths;

    @OneToMany(mappedBy = "id")
    private List<Evacuation> evacuations;

    @OneToMany(mappedBy = "id")
    private List<Rest> rests;

    @OneToMany(mappedBy = "id")
    private List<Medication> medications;

    @OneToOne
    private Feed feed;

    @OneToOne
    private Behavior behavior;

    @OneToOne
    private Person person;

    @OneToMany(mappedBy = "id")
    private List<Event> events;
}