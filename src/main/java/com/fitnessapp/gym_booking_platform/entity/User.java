package com.fitnessapp.gym_booking_platform.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false, unique = true, length = 15)
    private String mobile;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String role;

    @OneToMany(mappedBy = "user")
    private List<Booking> bookings;
}
