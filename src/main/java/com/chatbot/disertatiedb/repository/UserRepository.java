package com.chatbot.disertatiedb.repository;

import com.chatbot.disertatiedb.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
