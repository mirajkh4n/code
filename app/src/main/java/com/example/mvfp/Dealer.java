package com.example.mvfp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Dealer extends AppCompatActivity {
    TextView sign_up_dealer;
    Button dealer_sign_in_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dealer);

        sign_up_dealer = findViewById(R.id.sign_up_dealer);
        dealer_sign_in_btn = findViewById(R.id.dealer_sign_in_btn);

        sign_up_dealer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dealer.this,SignUp.class);
                startActivity(intent);
            }
        });

        dealer_sign_in_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dealer.this,Dealer_Hom_page.class);
                startActivity(intent);
            }
        });
    }
}