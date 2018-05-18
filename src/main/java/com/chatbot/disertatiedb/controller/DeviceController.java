package com.chatbot.disertatiedb.controller;

import com.chatbot.disertatiedb.model.Device;
import com.chatbot.disertatiedb.model.User;
import com.chatbot.disertatiedb.repository.DeviceRepository;
import com.chatbot.disertatiedb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DeviceController {
    @Autowired
    private DeviceRepository deviceRepository;
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/authorize/{id}")
    public User getDevice(@PathVariable("id") String androidId) {
        Integer userId = deviceRepository.findUserIdByAndroidId(androidId);
        return userRepository.findOne(userId);
    }

    @PostMapping("/saveDevice")
    public void saveDevice(@RequestBody Device device) {
        deviceRepository.save(device);
    }
}
