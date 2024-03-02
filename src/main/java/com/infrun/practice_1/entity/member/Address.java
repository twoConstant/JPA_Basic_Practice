package com.infrun.practice_1.entity.member;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Address {

    @Column(name = "CITY", nullable = false)
    private String city;

    @Column(name = "STREET", nullable = false)
    private String street;

    @Column(name = "ZIPCODE", nullable = false)
    private String zipcode;

    public void toStringAddress() {
        System.out.println(this.city + " " + this.street + " " + this.zipcode);
    }
}
