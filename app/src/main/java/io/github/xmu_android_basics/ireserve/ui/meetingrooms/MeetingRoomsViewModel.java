package io.github.xmu_android_basics.ireserve.ui.meetingrooms;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MeetingRoomsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public MeetingRoomsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is notifications fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}