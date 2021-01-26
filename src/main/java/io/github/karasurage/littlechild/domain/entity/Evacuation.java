package io.github.karasurage.littlechild.domain.entity;

import io.github.karasurage.littlechild.domain.enums.StoolFeature;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@Table(name = "tb_evacuation")
@EqualsAndHashCode(of = {"id"})
@AllArgsConstructor
@NoArgsConstructor
public class Evacuation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "stool_features")
    private StoolFeature stoolFeature;

    @ManyToOne
    @JoinColumn(name = "diary_id")
    private Diary diary;
}