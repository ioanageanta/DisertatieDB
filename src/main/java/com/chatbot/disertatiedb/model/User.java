package com.chatbot.disertatiedb.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity(name = "User")
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Integer id;
    @Column
    private String email;


    @OneToMany(
            mappedBy = "user",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Device> deviceList = new ArrayList<>();

    public User() {}

    public User(String email) {
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void addDevice(Device device) {
        deviceList.add(device);
        device.setUser(this);
    }

    public void removeDevice(Device device) {
        deviceList.remove(device);
        device.setUser(null);
    }
}
