package com.example.vulnapp.controller;

import com.example.vulnapp.dto.ApplicationDTO;
import com.example.vulnapp.dto.UserDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @PostMapping(value = "/user", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ApplicationDTO createUser(@RequestBody ApplicationDTO application) {
        return application;
    }
}
