package io.github.karasurage.littlechild.domain.entity;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalTime;

@Entity
@Getter
@Setter
@ToString
@Table(name = "tb_rest")
@EqualsAndHashCode(of = {"id"})
@AllArgsConstructor
@NoArgsConstructor
public class Rest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Temporal(TemporalType.TIME)
    @DateTimeFormat(pattern = "HH:mm")
    @Column(name = "restart_start_time")
    private LocalTime restStartTime;

    @Temporal(TemporalType.TIME)
    @DateTimeFormat(pattern = "HH:mm")
    @Column(name = "restart_end_time")
    private LocalTime restEndTime;

    @ManyToOne
    @JoinColumn(name = "diary_id")
    private Diary diary;
}