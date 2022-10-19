package com.example.qrgenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    Button generateQR, scanQR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        generateQR = findViewById(R.id.idBtnGenerateQR);
        scanQR = findViewById(R.id.idBtnScanQR);

        generateQR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, GenerateQRCodeActivity.class);
                startActivity(intent);
            }
        });


        scanQR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, ScanQRCodeActivity.class);
                startActivity(intent);
            }
        });

    }
}