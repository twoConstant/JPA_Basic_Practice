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
public class Book extends Item {

    @Column(name = "AUTHOR", nullable = false)
    private String author;

    @Column(name = "ISBN", nullable = false)
    private int isbn;
}
