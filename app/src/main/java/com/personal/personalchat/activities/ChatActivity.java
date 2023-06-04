package com.personal.personalchat.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.personal.personalchat.R;
import com.personal.personalchat.databinding.ActivityChatBinding;
import com.personal.personalchat.models.User;
import com.personal.personalchat.utilities.Constants;

public class ChatActivity extends AppCompatActivity {

    private ActivityChatBinding binding;
    private User receiverUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityChatBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setListeners();
        loadReceiverDetails();
    }

    private void loadReceiverDetails() {
        receiverUser = (User) getIntent().getSerializableExtra(Constants.KEY_USER);
        binding.textName.setText(receiverUser.name);
    }

    private void setListeners() {
        binding.imageBack.setOnClickListener(v -> onBackPressed());
    }
}