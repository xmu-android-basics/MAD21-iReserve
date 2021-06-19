package io.github.xmu_android_basics.ireserve.data.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Reservation {
    private final long timestamp = System.currentTimeMillis();
    private String meetingRoom;
    private String date;
    private String timeStart;
    private String timeEnd;
    private String usage = "";
    private String memo;

    public Reservation(String meetingRoom, String date, String timeStart, String timeEnd, String usage, String memo) {
        this.setMeetingRoom(meetingRoom);
        this.setDate(date);
        this.setTimeStart(timeStart);
        this.setTimeEnd(timeEnd);
        this.setUsage(usage);
        this.setMemo(memo);
    }

    public Reservation(String meetingRoom, String date, String timeStart, String timeEnd, String usage) {
        this(meetingRoom, date, timeStart, timeEnd, usage, "");
    }

    public Reservation(String meetingRoom, String date, String timeStart, String timeEnd) {
        this(meetingRoom, date, timeStart, timeEnd, "", "");
    }

    public String getMeetingRoom() {
        return meetingRoom;
    }

    public void setMeetingRoom(String meetingRoom) {
        this.meetingRoom = meetingRoom;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(String timeStart) {
        this.timeStart = timeStart;
    }

    public String getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(String timeEnd) {
        this.timeEnd = timeEnd;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    @NonNull
    @Override
    public String toString() {
        return getDate().toString() + " : " + getMeetingRoom().toString();
    }

    @Override
    public boolean equals(@Nullable Object obj) {
        if (obj instanceof Reservation) {
            return this.timestamp == ((Reservation) obj).timestamp;
        } else {
            return false;
        }
    }
}
