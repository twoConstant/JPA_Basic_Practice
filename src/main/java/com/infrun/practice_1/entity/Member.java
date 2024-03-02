package com.infrun.practice_1.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MEMBER_ID")
    private Long memberId;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "CITY", nullable = false)
    private String city;

    @Column(name = "STREET", nullable = false)
    private String street;

    @Column(name = "ZIPCODE", nullable = false)
    private String zipcode;

    // 연관관계 설정
    // mappedBy는 테이블과 매핑하는게 아닌 그냥 순수 객체의 관계 설정이기 때문에
    // "객체명"을 적는다.
    @OneToMany(mappedBy = "member")
    // 컬랙션 자료를 초기화해주면 nullpoint 예외를 예방 할 수 있다.
    private List<Order> orderList = new ArrayList<>();

}

