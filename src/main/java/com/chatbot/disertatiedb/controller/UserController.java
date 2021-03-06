package com.chatbot.disertatiedb.controller;

import com.chatbot.disertatiedb.model.User;
import com.chatbot.disertatiedb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/getUsers")
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/getUser/{id}")
    public User getUser(@PathVariable("id") Integer id) {
        return userRepository.findOne(id);
    }

    @PostMapping("/save")
    public User saveUser(@RequestBody User user) {
        Optional.ofNullable(user.getDeviceList())
                .orElse(new ArrayList<>())
                .forEach(device -> device.setUser(user));

        return userRepository.save(user);
    }
}
