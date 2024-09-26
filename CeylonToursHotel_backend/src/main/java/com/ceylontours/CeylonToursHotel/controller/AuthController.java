package com.ceylontours.CeylonToursHotel.controller;

import com.ceylontours.CeylonToursHotel.dto.LoginRequest;
import com.ceylontours.CeylonToursHotel.dto.Response;
import com.ceylontours.CeylonToursHotel.entity.User;
import com.ceylontours.CeylonToursHotel.service.interfac.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private IUserService userService;

    @PostMapping("/register")
    public ResponseEntity<Response> register (@RequestBody User user){
        Response response=userService.register(user);
        return ResponseEntity.status(response.getStatusCode()).body(response);
    }

    @PostMapping("/login")
    public ResponseEntity<Response> login (@RequestBody LoginRequest loginRequest){
        Response response=userService.login(loginRequest);
        return ResponseEntity.status(response.getStatusCode()).body(response);
    }

}
