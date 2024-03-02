package com.infrun.practice_1.entity.item;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Movie extends Item{

    @Column(name = "DIRECTOR", nullable = false)
    private String director;

    @Column(name = "ACTOR", nullable = false)
    private String actor;
}

