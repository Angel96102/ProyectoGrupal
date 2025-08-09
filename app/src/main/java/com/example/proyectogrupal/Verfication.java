package com.example.proyectogrupal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Verfication extends AppCompatActivity {
    Button btnSend;
    Button btnbacktree;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_verfication);
        btnSend = findViewById(R.id.btnSend);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentbtnSend = new Intent(Verfication.this, ResetPassword.class);
                startActivity(intentbtnSend);

            }
        });
        btnbacktree = findViewById(R.id.btnbacktree);
        btnbacktree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentbacktree = new Intent(Verfication.this, WelcomeBack.class);
                startActivity(intentbacktree);

            }
        });

    }
}