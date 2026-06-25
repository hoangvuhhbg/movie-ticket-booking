package com.example.movieservice.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "seat")
@Data
public class Seat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "room_id", nullable = false)
    private Room room;

    @Column(name = "seat_row", nullable = false)
    private String seatRow;

    @Column(name = "seat_number", nullable = false)
    private int seatNumber;

    @Column(name = "is_active", nullable = false)
    private Boolean isActive = true;
}