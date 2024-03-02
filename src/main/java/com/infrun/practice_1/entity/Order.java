package com.infrun.practice_1.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
// 객체명은 Order지만 매핑되는 테이블명은 ORDERS로 설정
@Table(name = "ORDERS")
public class Order {

    @Id
    // MySql에서 IDENTITY 기능 지원함 영속성 컨택스트에 들어가면 자동으로 ID 부여
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ORDERS_ID")
    private Long orderId;

    @Column(name = "ORDER_DATE", nullable = false)
    // 자바의 시간 데이터 타입인 LocalDateTime은 JPA가 자동으로 DB 시간 타입에 맞게
    // 변경해줌 변경 불가능한 자바 시간 데이터인경구 @Temporal 설정해주면됨
    private LocalDateTime orderDate;

    // EnumType.STRING은 항상 설정 해주기
    @Enumerated(EnumType.STRING)
    @Column(name = "STATUS", nullable = false)
    private STATUS status;

    // 연관관계 영역
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MEMBER_ID")  //해당 객체를 테이블의 MEMBER_ID에 매핑한다는 말임
    private Member member;

    @OneToMany(mappedBy = "order")
    private List<OrderItem> orderItemList = new ArrayList<>();
}
