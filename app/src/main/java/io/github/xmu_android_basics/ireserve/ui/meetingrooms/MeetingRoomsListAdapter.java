package io.github.xmu_android_basics.ireserve.ui.meetingrooms;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;

import org.jetbrains.annotations.NotNull;

import io.github.xmu_android_basics.ireserve.data.model.MeetingRoom;
import io.github.xmu_android_basics.ireserve.ui.dashboard.ReservationViewHolder;

public class MeetingRoomsListAdapter extends ListAdapter<MeetingRoom, MeetingRoomsViewHolder> {

    protected MeetingRoomsListAdapter() {
        super(new MeetingRoomDiff());
    }

    @Override
    public MeetingRoomsViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        return MeetingRoomsViewHolder.create(parent);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull MeetingRoomsViewHolder holder, int position) {
        MeetingRoom meetingRoom = getItem(position);
        holder.bind(meetingRoom);
    }

    static class MeetingRoomDiff extends DiffUtil.ItemCallback<MeetingRoom> {
        @Override
        public boolean areItemsTheSame(@NonNull MeetingRoom oldItem, @NonNull MeetingRoom newItem) {
            return oldItem == newItem;
        }

        @Override
        public boolean areContentsTheSame(@NonNull MeetingRoom oldItem, @NonNull MeetingRoom newItem) {
            return oldItem.equals(newItem);
        }
    }

}
