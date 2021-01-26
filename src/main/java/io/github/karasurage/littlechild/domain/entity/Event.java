package io.github.karasurage.littlechild.domain.entity;

import io.github.karasurage.littlechild.domain.enums.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalTime;

@Entity
@Getter
@Setter
@ToString
@Table(name = "tb_event")
@EqualsAndHashCode(of = {"id"})
@AllArgsConstructor
@NoArgsConstructor
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.TIME)
    @DateTimeFormat(pattern = "HH:mm")
    @Column(name = "start_event_time")
    private LocalTime startEventTime;

    @Temporal(TemporalType.TIME)
    @DateTimeFormat(pattern = "HH:mm")
    @Column(name = "end_event_time")
    private LocalTime endEventTime;

    @Enumerated(EnumType.STRING)
    @Column(name = "event_type")
    private EventType eventType;

    @Enumerated(EnumType.STRING)
    @Column(name = "meal_type")
    private MealType mealType;

    @Enumerated(EnumType.STRING)
    @Column(name = "student_option_meal")
    private StudentOptionMeal studentOptionMeal;

    private boolean dessert;

    private boolean drink;

    @Enumerated(EnumType.STRING)
    @Column(name = "behavior_type")
    private BehaviorType behaviorType;

    @Column(name = "behavior_observation")
    private String behaviorObservation;

    @Column(name = "stool_feature")
    private StoolFeature stoolFeature;

    @Column(name = "diapers_change")
    private boolean diapersChange;

    private String dosage;

    @Column(name = "medication_name")
    private String medicationName;

    @Column(name = "responsible_application")
    private String responsibleApplication;

    private BigDecimal temperature;

    @ManyToOne
    @JoinColumn(name = "diary_id")
    private Diary diary;

}
