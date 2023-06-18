package com.jere.template.controller;

import com.jere.template.dto.UserDto;
import com.jere.template.marker.OnCreate;
import com.jere.template.marker.OnUpdate;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@Validated
public class UserController {

    @GetMapping("/users")
    ResponseEntity<List<UserDto>> getUser() {

        UserDto user = new UserDto("00001","Jeremiah","Cadias");

        return ResponseEntity.ok(List.of(user));
    }

    @PostMapping("/users")
    @Validated(OnCreate.class)
    ResponseEntity<UserDto> createUser(@Valid @RequestBody UserDto user) {

        return ResponseEntity.ok(user);
    }

    @PutMapping("/users/{userid}")
    @Validated(OnUpdate.class)
    ResponseEntity updateUser(@Valid @RequestBody UserDto user) {

        return ResponseEntity.noContent().build();
    }
}

