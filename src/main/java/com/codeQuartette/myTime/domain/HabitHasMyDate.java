package com.codeQuartette.myTime.domain;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;

@Entity
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class HabitHasMyDate {

    @EmbeddedId
    private HabitHasMyDateId habitHasMyDateId;

    @ManyToOne
    @JoinColumn(name = "habitId")
    @MapsId("habitId")
    private Habit habit;

    @ManyToOne
    @JoinColumn(name = "myDateId")
    @MapsId("myDateId")
    private MyDate myDate;

    @Builder.Default
    @ColumnDefault("false")
    private Boolean isDone = false;
}
