package com.example.proyectogrupal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class WelcomeBack extends AppCompatActivity {
    Button btnbacktwo;
    TextView tvForgotPassword;
    TextView tvRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_welcome_back);
        //cargar el xml a java para manipular
        btnbacktwo = findViewById(R.id.btnbacktwo);
        btnbacktwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLogin = new Intent(WelcomeBack.this, MainActivity.class);
                startActivity(intentLogin);

            }
        });
        tvForgotPassword = findViewById(R.id.tvForgotPassword);
        tvForgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentPassword = new Intent(WelcomeBack.this, Verfication.class);
                startActivity(intentPassword);

            }
        });
        tvRegister = findViewById(R.id.tvRegister);
        tvRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentRegister = new Intent(WelcomeBack.this, MainActivity.class);
                startActivity(intentRegister);

            }
        });

    }
}