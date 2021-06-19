package io.github.xmu_android_basics.ireserve.ui.dashboard;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

import io.github.xmu_android_basics.ireserve.data.Demo;
import io.github.xmu_android_basics.ireserve.data.model.Reservation;

public class DashboardViewModel extends ViewModel {

    private final MutableLiveData<List<Reservation>> _reservationList;

    public DashboardViewModel() {
        _reservationList = new MutableLiveData<>();
        _reservationList.setValue(Demo.getReservationList());
    }

    public LiveData<List<Reservation>> getReservationList() {
        return _reservationList;
    }
}