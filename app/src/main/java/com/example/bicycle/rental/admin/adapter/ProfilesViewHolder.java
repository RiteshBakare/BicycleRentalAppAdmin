package com.example.bicycle.rental.admin.adapter;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bicycle.rental.admin.databinding.UserProfileTileBinding;
import com.example.bicycle.rental.admin.models.User;

public class ProfilesViewHolder extends RecyclerView.ViewHolder {

    private final TextView personName;
    private final TextView personMail;


    public ProfilesViewHolder(@NonNull UserProfileTileBinding binding) {
        super(binding.getRoot());
        personName = binding.tvName;
        personMail = binding.tvMail;
    }

    public void bind(User user) {
        personName.setText(user.getUsername());
        personMail.setText(user.getEmail());
    }


}
