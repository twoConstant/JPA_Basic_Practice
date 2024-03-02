package com.infrun.practice_1.entity.member;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Embeddable
@NoArgsConstructor
@Getter
@Setter
public class WorkPeriod {

    @Column(name = "STARTDATE", nullable = false)
    private LocalDateTime startDate;

    @Column(name = "ENDDATE", nullable = false)
    private LocalDateTime endDate;

}
