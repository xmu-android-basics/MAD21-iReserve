package io.github.xmu_android_basics.ireserve.ui.meetingrooms;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import io.github.xmu_android_basics.ireserve.databinding.FragmentMeetingRoomsBinding;

public class MeetingRoomsFragment extends Fragment {

    private MeetingRoomsViewModel meetingRoomsViewModel;
    private FragmentMeetingRoomsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentMeetingRoomsBinding.inflate(inflater, container, false);

        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        MeetingRoomsListAdapter adapter = new MeetingRoomsListAdapter();
        binding.meetingroomList.setAdapter(adapter);

        meetingRoomsViewModel =
                new ViewModelProvider(this).get(MeetingRoomsViewModel.class);

        meetingRoomsViewModel.getMeetingRoomList().observe(getViewLifecycleOwner(),
                adapter::submitList);

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}