package com.chatbot.disertatiedb.controller;

import com.chatbot.disertatiedb.model.Device;
import com.chatbot.disertatiedb.model.User;
import com.chatbot.disertatiedb.repository.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DeviceController {
    @Autowired
    private DeviceRepository deviceRepository;

    @GetMapping("/authorize/{id}")
    public User getDevice(@PathVariable("id") String androidId) {
        return deviceRepository.findUserIdByAndroidId(androidId);
    }

    @PostMapping("/saveDevice")
    public void saveDevice(@RequestBody Device device) {
        deviceRepository.save(device);
    }

    @GetMapping("/getDevice/{id}")
    public boolean isDevicePresent(@PathVariable("id") String id) {
        return deviceRepository.findDevice(id) != null;
    }
}
