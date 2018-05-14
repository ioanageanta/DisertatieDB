package com.chatbot.disertatiedb.controller;

import com.chatbot.disertatiedb.model.User;
import com.chatbot.disertatiedb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping(value = "/getUsers")
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/getUser/{id}")
    public User getUser(@PathVariable("id") Integer id) {
        return userRepository.findOne(id);
    }

    @PostMapping("/save")
    public void saveUser(@RequestBody User user) {
        userRepository.save(user);
    }
}
