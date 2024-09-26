package com.ceylontours.CeylonToursHotel.service.interfac;

import com.ceylontours.CeylonToursHotel.dto.Response;
import com.ceylontours.CeylonToursHotel.entity.Booking;

public interface IBookingService {
    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);
}
