package com.example.mvfp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Admin extends AppCompatActivity {
    TextView sign_up_admin;
    Button admin_sign_in,sign_up_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

        sign_up_admin = findViewById(R.id.sign_up_admin_btn);
        admin_sign_in = findViewById(R.id.admin_sign_in_btn);
        admin_sign_in = findViewById(R.id.sign_up_btn);

        sign_up_admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Admin.this,SignUp.class);
                startActivity(intent);
            }
        });

        admin_sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Admin.this,Admin_Home_page.class);
                startActivity(i);
            }
        });
    }
}