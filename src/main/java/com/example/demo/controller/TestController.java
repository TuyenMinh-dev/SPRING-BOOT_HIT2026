package com.example.demo.controller;

import com.example.demo.dto.request.CreateUserRequest;
import com.example.demo.model.User; // Import đúng model của bạn
import com.example.demo.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/test")
public class TestController {

    @Autowired
    private UserService userService;

    // 1. Test POST: Kiểm tra Validation và thêm User
    @PostMapping("/add-user")
    public ResponseEntity<User> testAddUser(@Valid @RequestBody CreateUserRequest request) {
        // Gọi hàm addUser từ UserService bạn đã viết
        User user = userService.addUser(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }

    // 2. Test GET: Kiểm tra xem User đã được lưu vào List trong Service chưa
    @GetMapping("/all-users")
    public ResponseEntity<List<User>> testGetAll() {
        List<User> users = userService.getAllUser();
        return ResponseEntity.ok(users);
    }

    // 3. Test Health Check: Xem Controller có chạy không
    @GetMapping("/ping")
    public String ping() {
        return "TestController is up and running!";
    }
}