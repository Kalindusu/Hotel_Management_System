package com.ceylontours.CeylonToursHotel.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="rooms")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String bookingConfiremationCode;
    private String roomType;
    private String roomPrice;
    private String roomPhotoUrl;
}
