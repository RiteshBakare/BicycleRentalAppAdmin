package com.example.bicycle.rental.admin.adapter;


import android.content.Context;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bicycle.rental.admin.models.User;

import java.util.List;

public class ProfileRVAdapter extends RecyclerView.Adapter<ProfilesViewHolder> {

    private final Context context;
    private final List<User> userList;

    public ProfileRVAdapter(Context context,List<User> userList) {
        this.context = context;
        this.userList = userList;
    }

    @NonNull
    @Override
    public ProfilesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ProfilesViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
