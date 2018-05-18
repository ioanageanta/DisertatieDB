package com.chatbot.disertatiedb.repository;

import com.chatbot.disertatiedb.model.Device;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DeviceRepository extends JpaRepository<Device, Integer> {
    @Query("select user_id from devices d where d.android_id = ?1")
    Integer findUserIdByAndroidId(String androidId);
}
