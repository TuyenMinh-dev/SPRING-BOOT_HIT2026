package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.dto.request.CreateUserRequest;
import com.example.demo.model.Product;
import com.example.demo.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private List<User> users = new ArrayList<>();

    public UserService(List<User> users) {
        this.users = users;
    }
    public List<User> getAllUser(){
        return users;
    }
    public UserService() {
        users.add(new User(20, "lmt@gmail.com", "Tuyen", "0337603134"));
        users.add(new User(18, "vqh@gmail.com", "Huy", "0337603135"));
    }
    public User addUser(CreateUserRequest a){
        User newUser = new User();
        newUser.setName(a.getName());
        newUser.setAge(a.getAge());
        newUser.setPhone(a.getPhone());
        newUser.setEmail(a.getEmail());
        users.add(newUser);
        return newUser;
    }

}
