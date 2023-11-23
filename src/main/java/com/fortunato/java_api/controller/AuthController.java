package com.fortunato.java_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fortunato.java_api.dto.AuthDTO;
import com.fortunato.java_api.dto.UserDTO;
import com.fortunato.java_api.model.UserModel;
import com.fortunato.java_api.services.AuthService;
import com.fortunato.java_api.services.UserService;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UserService userService;

    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public AuthDTO login(@RequestBody UserModel user) {
        var resp = this.userService.findByEmail(user.getEmail());
        if (resp != null) {
            if (resp.getPassword().equals(user.getPassword())) {
                AuthDTO auth = new AuthDTO();
                String token = authService.createToken(user);
                auth.setToken(token);

                UserDTO userInfo = new UserDTO();
                userInfo.setName(resp.getName());
                userInfo.setEmail(resp.getEmail());
                userInfo.setAdmin(resp.isAdmin());
                auth.setUser(userInfo);

                return auth;
            }
        }
        return null;
    }

    @PostMapping("/validate")
    public String validate(@RequestHeader("Authorization") String token) {
        final var validate = this.authService.validateToken(token.replace("Bearer ", ""));
        if (!validate.isBlank()) {
            return validate;
        }
        return "token not valid";
    }

}