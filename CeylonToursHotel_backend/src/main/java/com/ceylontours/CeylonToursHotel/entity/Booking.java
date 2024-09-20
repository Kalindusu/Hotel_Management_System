package com.ceylontours.CeylonToursHotel.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.Min;
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


@Min(value = 1,message="Number of adult must not be less that 1")
    private int numOfAdult;
    @Min(value = 0,message="Number of children must not be less that 0")
    private int numOfChildren;
    private int totalNumOfGuest;
    private String bookingConfiremationCode;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="user_id")
    private User user;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="room_id")
    private Room room;

    public void calculateTotalNumberofGuests(){
        this.totalNumOfGuest=this.numOfAdult+this.numOfChildren;
    }

    public void setNumOfAdult(int numOfAdult) {
        this.numOfAdult = numOfAdult;
        calculateTotalNumberofGuests();
    }

    public void setNumOfChildren(int numOfChildren) {
        this.numOfChildren = numOfChildren;
        calculateTotalNumberofGuests();
    }

    @Override
    public String toString() {
        return "Booking{" +
                "id=" + id +
                ", checkInData=" + checkInData +
                ", checkOutData=" + checkOutData +
                ", numOfAdult=" + numOfAdult +
                ", numOfChildren=" + numOfChildren +
                ", totalNumOfGuest=" + totalNumOfGuest +
                ", bookingConfiremationCode='" + bookingConfiremationCode + '\'' +
                '}';
    }
}
