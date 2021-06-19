package io.github.xmu_android_basics.ireserve.ui.dashboard;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import io.github.xmu_android_basics.ireserve.data.model.Reservation;
import io.github.xmu_android_basics.ireserve.databinding.ReservationListItemBinding;

public class ReservationViewHolder extends RecyclerView.ViewHolder {
    private final ReservationListItemBinding _binding;

    public ReservationViewHolder(ReservationListItemBinding binding) {
        super(binding.getRoot());

        _binding = binding;
    }

    public void bind(Reservation reservation) {
        _binding.date.setText(reservation.getDate());
        _binding.timeStart.setText(reservation.getTimeStart());
        _binding.timeEnd.setText(reservation.getTimeEnd());
        _binding.meetingRoom.setText(reservation.getMeetingRoom());
        _binding.usage.setText("用途：" + reservation.getUsage());
    }

    public static ReservationViewHolder create(@NonNull ViewGroup parent) {
        return new ReservationViewHolder(
                ReservationListItemBinding.inflate(
                        LayoutInflater.from(parent.getContext()),
                        parent,
                        false)
        );
    }
}
