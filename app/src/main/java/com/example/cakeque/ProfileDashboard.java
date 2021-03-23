package com.example.cakeque;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class ProfileDashboard extends AppCompatActivity {

    public Button button;
    public Button button1;
    public Button button2;
    public Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_dashboard);

        button = (Button) findViewById(R.id.btnCake);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(ProfileDashboard.this,MainActivity.class);
                startActivity(intent);
            }

        });
        button1 = (Button) findViewById(R.id.btncen);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(ProfileDashboard.this,CreateProfile.class);
                startActivity(intent1);
            }
        });
        button2 = (Button) findViewById(R.id.btnpro);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(ProfileDashboard.this,ViewPage.class);
                startActivity(intent2);
            }
        });
        button3 = (Button) findViewById(R.id.btnup);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(ProfileDashboard.this,ModifyPage.class);
                startActivity(intent3);
            }
        });

    }

}