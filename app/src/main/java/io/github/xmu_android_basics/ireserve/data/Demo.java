package io.github.xmu_android_basics.ireserve.data;

import java.util.ArrayList;
import java.util.List;

import io.github.xmu_android_basics.ireserve.data.model.MeetingRoom;
import io.github.xmu_android_basics.ireserve.data.model.Reservation;

public class Demo {
    private static final List<Reservation> _reservationList = new ArrayList<>();

    private static final List<MeetingRoom> _meetingRoomList = new ArrayList<>();

    public static List<Reservation> getReservationList() {
        final String TIME_START = "8:00";
        final String TIME_END = "12:00";

        if (_reservationList.size() == 0) {
            _reservationList.add(new Reservation("414", "2021-5-17", TIME_START, TIME_END));
            _reservationList.add(new Reservation("306", "2021-5-18", TIME_START, TIME_END));
            _reservationList.add(new Reservation("306", "2021-5-21", TIME_START, TIME_END));
            _reservationList.add(new Reservation("414", "2021-5-21", TIME_START, TIME_END));
            _reservationList.add(new Reservation("505", "2021-5-28", TIME_START, TIME_END));
        }

        return _reservationList;
    }

    public static List<MeetingRoom> getMeetingRoomList() {
        if (_meetingRoomList.size() == 0) {
            _meetingRoomList.add(new MeetingRoom("行政楼A201"));
            _meetingRoomList.add(new MeetingRoom("行政楼A202"));
            _meetingRoomList.add(new MeetingRoom("行政楼A306"));
            _meetingRoomList.add(new MeetingRoom("行政楼C501"));
            _meetingRoomList.add(new MeetingRoom("行政楼C505"));
            _meetingRoomList.add(new MeetingRoom("行政楼C510"));
        }

        return _meetingRoomList;
    }
}
