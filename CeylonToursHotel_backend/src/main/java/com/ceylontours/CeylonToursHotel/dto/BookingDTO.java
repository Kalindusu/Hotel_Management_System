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
    private LocalDate checkInData;
    private LocalDate checkOutData;
    private int numOfAdult;
    private int numOfChildren;
    private int totalNumOfGuest;
    private String bookingConfiremationCode;
    private UserDTO user;
    private RoomDTO room;
}
