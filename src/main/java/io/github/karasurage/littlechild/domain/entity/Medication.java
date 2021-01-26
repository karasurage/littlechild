package io.github.karasurage.littlechild.domain.entity;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalTime;

@Entity
@Getter
@Setter
@ToString
@Table(name = "tb_medication")
@EqualsAndHashCode(of = {"id"})
@AllArgsConstructor
@NoArgsConstructor
public class Medication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name_medication")
    private String nameMedication;

    @Temporal(TemporalType.TIME)
    @DateTimeFormat(pattern = "HH:mm")
    @Column(name = "medication_time")
    private LocalTime medicationTime;

    private String dosage;

    @Column(name = "responsibleApplication")
    private String responsibleApplication;

    private BigDecimal temperature;

    @ManyToOne
    @JoinColumn(name = "diary_id")
    private Diary diary;
}