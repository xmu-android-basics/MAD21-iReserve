package io.github.xmu_android_basics.ireserve.ui.meetingrooms;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import io.github.xmu_android_basics.ireserve.data.model.MeetingRoom;
import io.github.xmu_android_basics.ireserve.databinding.RoomListItemBinding;

public class MeetingRoomsViewHolder extends RecyclerView.ViewHolder {
    private RoomListItemBinding _binding;

    public MeetingRoomsViewHolder(RoomListItemBinding binding) {
        super(binding.getRoot());

        _binding = binding;
    }

    public void bind(MeetingRoom meetingRoom) {
        _binding.name.setText(meetingRoom.getName());
        _binding.capacity.setText(String.valueOf(meetingRoom.getCapacity()));
    }

    public static MeetingRoomsViewHolder create(@NonNull ViewGroup parent) {
        return new MeetingRoomsViewHolder(
                RoomListItemBinding.inflate(
                        LayoutInflater.from(parent.getContext()),
                        parent,
                        false)
        );
    }
}
