package com.chatbot.disertatiedb.repository;

import com.chatbot.disertatiedb.model.Device;
import com.chatbot.disertatiedb.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface DeviceRepository extends JpaRepository<Device, Integer> {
    @Query("select d.user from Device d where d.androidId=:androidId")
    User findUserIdByAndroidId(@Param("androidId") String androidId);

    @Query("select d.id from Device d where d.androidId=:androidId")
    Integer findDevice(@Param("androidId") String androidId);
}
