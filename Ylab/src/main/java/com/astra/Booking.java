package com.astra;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class Booking {
    private User user;
    private WorkingSpace workingSpace;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Map<String,Booking> bookings = new HashMap<>();

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public WorkingSpace getWorkingSpace() {
        return workingSpace;
    }

    public void setWorkingSpace(WorkingSpace workingSpace) {
        this.workingSpace = workingSpace;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public Booking(User user, WorkingSpace workingSpace, LocalDateTime startTime, LocalDateTime endTime) {
        this.user = user;
        this.workingSpace = workingSpace;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public void createBooking(User user,String name, LocalDateTime startTime, LocalDateTime endTime ){
        bookings.put(user,new Booking(user,))


    }
}
