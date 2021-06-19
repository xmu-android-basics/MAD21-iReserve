package io.github.xmu_android_basics.ireserve.ui.dashboard;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;

import io.github.xmu_android_basics.ireserve.data.model.Reservation;


public class ReservationListAdapter extends ListAdapter<Reservation, ReservationViewHolder> {

    protected ReservationListAdapter() {
        super(new ReservationDiff());
    }

    @Override
    public ReservationViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return ReservationViewHolder.create(parent);
    }

    @Override
    public void onBindViewHolder(@NonNull ReservationViewHolder holder, int position) {
        Reservation reservation = getItem(position);
        holder.bind(reservation);
    }

    static class ReservationDiff extends DiffUtil.ItemCallback<Reservation> {
        @Override
        public boolean areItemsTheSame(@NonNull Reservation oldItem, @NonNull Reservation newItem) {
            return oldItem == newItem;
        }

        @Override
        public boolean areContentsTheSame(@NonNull Reservation oldItem, @NonNull Reservation newItem) {
            return oldItem.equals(newItem);
        }
    }

}
