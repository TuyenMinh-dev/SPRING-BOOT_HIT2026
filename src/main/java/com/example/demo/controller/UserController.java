package com.example.demo.controller;

import com.example.demo.dto.request.CreateUserRequest;
import com.example.demo.service.UserService;
import jakarta.validation.Valid;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<User> createUser(@Valid @RequestBody CreateUserRequest createUser ) {
        // Nếu validation FAIL → Spring tự động throw MethodArgumentNotValidException
        // Nếu validation PASS → code tiếp tục chạy bình thường
        User user = (User) userService.addUser(createUser);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }


}