package me.jay.springbootdeveloper;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor@AllArgsConstructor
@Getter@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id; // DB테이블의 'id'컬럼 매칭

    @Column(name = "name", nullable = false)
    private String name;
}
