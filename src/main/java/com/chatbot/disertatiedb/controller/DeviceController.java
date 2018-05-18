package com.chatbot.disertatiedb.controller;

import com.chatbot.disertatiedb.model.Device;
import com.chatbot.disertatiedb.repository.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DeviceController {
    @Autowired
    private DeviceRepository deviceRepository;

    @GetMapping("/getDevice/{id}")
    public String getDevice(@PathVariable("id") String androidId) {
        //return deviceRepository.findOne(id);
        //select email from users where id=(select user_id from devices where android_id=androidId)
        return "";
    }

    @PostMapping("/saveDevice")
    public void saveDevice(@RequestBody Device device) {
        deviceRepository.save(device);
    }
}
