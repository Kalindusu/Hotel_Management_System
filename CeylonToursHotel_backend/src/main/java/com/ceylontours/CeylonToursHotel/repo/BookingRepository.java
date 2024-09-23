package com.ceylontours.CeylonToursHotel.repo;

import com.ceylontours.CeylonToursHotel.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookingRepository extends JpaRepository<Booking, Long> {

    Optional<Booking> findByBookingConfirmationCode(String confirmationCode);
}
