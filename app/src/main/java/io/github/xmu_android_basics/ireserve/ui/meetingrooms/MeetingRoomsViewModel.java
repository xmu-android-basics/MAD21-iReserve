package io.github.xmu_android_basics.ireserve.ui.meetingrooms;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

import io.github.xmu_android_basics.ireserve.data.Demo;
import io.github.xmu_android_basics.ireserve.data.model.MeetingRoom;

public class MeetingRoomsViewModel extends ViewModel {

    private final MutableLiveData<List<MeetingRoom>> _meetingRoomList;

    public MeetingRoomsViewModel() {
        _meetingRoomList = new MutableLiveData<>();
        _meetingRoomList.setValue(Demo.getMeetingRoomList());
    }

    public LiveData<List<MeetingRoom>> getMeetingRoomList() {
        return _meetingRoomList;
    }
}