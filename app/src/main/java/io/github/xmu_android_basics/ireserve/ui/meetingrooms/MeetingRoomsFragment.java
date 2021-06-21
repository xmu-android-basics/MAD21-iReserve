package io.github.xmu_android_basics.ireserve.ui.meetingrooms;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import io.github.xmu_android_basics.ireserve.databinding.FragmentMeetingRoomsBinding;

public class MeetingRoomsFragment extends Fragment {

    private MeetingRoomsViewModel meetingRoomsViewModel;
    private FragmentMeetingRoomsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        meetingRoomsViewModel =
                new ViewModelProvider(this).get(MeetingRoomsViewModel.class);

        binding = FragmentMeetingRoomsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textNotifications;
        meetingRoomsViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}