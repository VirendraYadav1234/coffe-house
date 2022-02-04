package com.example.food_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     Button login,logout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      login=findViewById(R.id.btnlogin);
      logout=findViewById(R.id.btnlogout);

       login.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

        Toast.makeText(MainActivity.this, "Login has been clicked", Toast.LENGTH_LONG).show();

        Intent intent=new Intent(MainActivity.this,activity_sign_in.class);
        startActivity(intent);
    }
});
         logout.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Toast.makeText(MainActivity.this, "sign up", Toast.LENGTH_SHORT).show();
                 Intent intent=new Intent(MainActivity.this,signUp_activity.class);
                 startActivity(intent);
             }
         });



    }



}