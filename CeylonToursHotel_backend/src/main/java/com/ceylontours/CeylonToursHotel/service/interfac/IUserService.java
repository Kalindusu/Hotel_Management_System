package com.ceylontours.CeylonToursHotel.service.interfac;

import com.ceylontours.CeylonToursHotel.dto.LoginRequest;
import com.ceylontours.CeylonToursHotel.dto.Response;
import com.ceylontours.CeylonToursHotel.entity.User;

public interface IUserService {

    Response register (User loginRequest);
    Response login (LoginRequest loginRequest);

    Response getAllUsers();
    Response getUserBookingHistory(String userId);
    Response deleteUser(String userId);
    Response getUserById(String userId);
    Response getMyInfo(String userId);
}
