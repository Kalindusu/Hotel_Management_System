package com.ceylontours.CeylonToursHotel.repo;

import com.ceylontours.CeylonToursHotel.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository  extends JpaRepository<Booking, Long> {
    List<Booking> findByRoomId(Long roomId);
}
