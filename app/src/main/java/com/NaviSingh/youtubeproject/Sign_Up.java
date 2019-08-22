package com.NaviSingh.youtubeproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sign_Up extends AppCompatActivity {

    private Button signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign__up);
        signUp = findViewById(R.id.SignUP);

    }

    public void LoginScreen(View view) {
        Intent intent = new Intent(Sign_Up.this, LoginScreen.class);
        startActivity(intent);
    }
}
