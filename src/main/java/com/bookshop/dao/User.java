package com.bookshop.dao;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Nationalized;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Nationalized
    @Column(nullable = false)
    private String firstName;

    @Nationalized
    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false, unique = true)
    private String username;

    @Nationalized
    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    @JsonIgnore
    private String password;

    @Column(nullable = false)
    private Long amount;

    @Column(nullable = false)
    private String role;

    @Column(nullable = false)
    private String phone;

    @CreationTimestamp
    private Timestamp createAt;

    @UpdateTimestamp
    private Timestamp updateAt;
}
