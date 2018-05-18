package com.chatbot.disertatiedb.model;

import javax.persistence.*;

@Entity(name = "Device")
@Table(name = "devices")
public class Device {
    @Id
    @GeneratedValue
    @Column
    private Integer id;
    @Column(name = "android_id")
    private String androidId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    public Device(String androidId, User user) {
        this.androidId = androidId;
        this.user = user;
    }

    public Device(String androidId) {
        this.androidId = androidId;
    }

    public Device() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAndroidId() {
        return androidId;
    }

    public void setAndroidId(String androidId) {
        this.androidId = androidId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Device )) return false;
        return id != null && id.equals(((Device) o).id);
    }
    @Override
    public int hashCode() {
        return 31;
    }
}
