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
public class Album extends Item {

    @Column(name = "ARTIST", nullable = false)
    private String artist;

    @Column(name = "ETC", nullable = true)
    private String etc;
}
