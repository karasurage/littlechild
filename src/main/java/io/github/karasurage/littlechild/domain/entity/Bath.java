package io.github.karasurage.littlechild.domain.entity;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalTime;

@Entity
@Getter
@Setter
@ToString
@Table(name = "tb_bath")
@EqualsAndHashCode(of = {"id"})
@AllArgsConstructor
@NoArgsConstructor
public class Bath {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.TIME)
    @DateTimeFormat(pattern = "HH:mm")
    @Column(name = "check_out")
    private LocalTime checkOut;

    @ManyToOne
    @JoinColumn(name = "diary_id")
    private Diary diary;
}
