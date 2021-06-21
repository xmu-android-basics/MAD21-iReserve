package io.github.xmu_android_basics.ireserve.data.model;

import androidx.annotation.Nullable;

public class MeetingRoom {
    private final long id;
    private String name;
    private String location;
    private int capacity;
    private String devices;

    public MeetingRoom(String name, int capacity, String devices) {
        this.name = name;
        this.capacity = capacity;
        this.devices = devices;
        this.id = name.hashCode();
    }

    public MeetingRoom(String name) {
        this(name, 0, "");
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getDevices() {
        return devices;
    }

    @Override
    public boolean equals(@Nullable Object obj) {
        if (obj instanceof MeetingRoom) {
            return this.id == ((MeetingRoom) obj).id;
        }
        return false;
    }
}
