package com.ceylontours.CeylonToursHotel.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NonNull;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.time.LocalDate;

@Data
@Entity
@Table(name="booking")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    @NotNull(message="check in date is required")
    private LocalDate checkInData;
    @Future(message="check out date must be in the future")
    private LocalDate checkOutData;

    private int numOfAdult;
    private int numOfChildren;
    private int totalNumOfGuest;
    private String bookingConfiremationCode;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="user_id")
    private User user;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="room_id")
    private Room room;






}
