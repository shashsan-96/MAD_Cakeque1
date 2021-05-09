package com.example.cakeque;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;


public class OrderDashboard extends AppCompatActivity {
    public Button viewButton;
    public Button button1;
    public Button modifyBtn;
    public Button cakebtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_dashboard);

        viewButton = (Button) findViewById(R.id.ViewOrdersBtn);

        viewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(OrderDashboard.this,OrderList.class);
                startActivity(intent);
            }
        });

        button1 = (Button) findViewById(R.id.createOrderBtn);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(OrderDashboard.this,CreateOrder.class);
                startActivity(intent);
            }
        });

        modifyBtn = (Button) findViewById(R.id.modifyOrderBtn);

        modifyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(OrderDashboard.this,ModifyOrder.class);
                startActivity(intent);
            }
        });

        cakebtn = (Button) findViewById(R.id.button3);

        cakebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(OrderDashboard.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}