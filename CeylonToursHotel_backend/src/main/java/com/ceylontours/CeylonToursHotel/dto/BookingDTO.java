package com.ceylontours.CeylonToursHotel.dto;

import com.ceylontours.CeylonToursHotel.entity.Room;
import com.ceylontours.CeylonToursHotel.entity.User;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

import java.time.LocalDate;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BookingDTO {
    private Long id;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private int numOfAdults;
    private int numOfChildren;
    private int totalNumOfGuest;
    private String bookingConfirmationCode;
    private UserDTO user;
    private RoomDTO room;

}