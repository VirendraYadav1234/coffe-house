package com.example.food_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class signUp_activity extends AppCompatActivity {

Button logg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        logg=findViewById(R.id.button_up);
        logg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(signUp_activity.this,activity_sign_in.class);
                startActivity(intent);
            }
        });
    }
}