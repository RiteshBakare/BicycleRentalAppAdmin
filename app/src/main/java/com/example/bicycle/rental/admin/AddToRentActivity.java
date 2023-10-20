package com.example.bicycle.rental.admin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;

import com.example.bicycle.rental.admin.databinding.ActivityAddToRentBinding;
import com.google.firebase.FirebaseApp;

public class AddToRentActivity extends AppCompatActivity {

    ActivityAddToRentBinding binding = null;

    Uri imageUri = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAddToRentBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.btnRegisterBicycle.setOnClickListener(view -> {

            if (checkData()) {
                Toast.makeText(this, "Data is Valid ", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Enter Valid Data", Toast.LENGTH_SHORT).show();
            }

        });

        binding.ivImage.setOnClickListener(view -> {

        });


    }

    Boolean checkData() {
        if (imageUri == null) {
            Toast.makeText(this, "Please Select an Image", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (binding.etBicycleName.getText().toString().isEmpty()) {
            binding.etBicycleName.setError("Please Enter a Name");
            return false;
        }
        if (binding.etBicycleRate.getText().toString().isEmpty()) {
            binding.etBicycleRate.setError("Please Enter a Name");
            return false;
        }
        if (binding.etBicycleRating.getText().toString().isEmpty()) {
            binding.etBicycleRating.setError("Please Enter a Name");
            return false;
        }
        if (binding.etBicycleDesc.getText().toString().isEmpty()) {
            binding.etBicycleDesc.setError("Please Enter a Name");
            return false;
        }
        return true;
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        binding = null;
    }
}