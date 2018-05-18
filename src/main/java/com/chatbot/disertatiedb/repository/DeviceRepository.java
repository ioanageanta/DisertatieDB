package com.chatbot.disertatiedb.repository;

import com.chatbot.disertatiedb.model.Device;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceRepository extends JpaRepository<Device, Integer> {
}
