package com.example.mvfp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Customer extends AppCompatActivity {
    TextView sign_up_customer;
    Button customer_sign_in_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer);

        sign_up_customer = findViewById(R.id.sign_up_customer);
        customer_sign_in_btn = findViewById(R.id.customer_sign_in_btn);

        sign_up_customer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Customer.this,SignUp.class);
                startActivity(intent);
            }
        });

        customer_sign_in_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Customer.this,Customer_Home_page.class);
                startActivity(intent);
            }
        });
    }
}