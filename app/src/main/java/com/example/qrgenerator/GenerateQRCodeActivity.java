package com.example.qrgenerator;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

import androidmads.library.qrgenearator.QRGEncoder;


//import com.google.android.material.textfield.TextInputEditText;
//import com.google.zxing.WriterException;
//
//import androidmads.library.qrgenearator.QRGContents;
//import androidmads.library.qrgenearator.QRGEncoder;

public class GenerateQRCodeActivity extends AppCompatActivity {

    TextView qrCodeTV;
    ImageView qrCodeIV;
    TextInputEditText dataEdit;
    Button generateQRBtn;
    Bitmap bitmap;
    QRGEncoder qrgEncoder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generate_qrcode);

        qrCodeTV = findViewById(R.id.idTVGeneratedCode);
        qrCodeIV = findViewById(R.id.idIVQrcode);
        dataEdit = findViewById(R.id.idEdtData);
        generateQRBtn = findViewById(R.id.idBtnGenerateCode);

        generateQRBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = dataEdit.getText().toString();
                if (data.isEmpty()){
                    Toast.makeText(GenerateQRCodeActivity.this, "Please enter the data to generate the QR code", Toast.LENGTH_SHORT).show();
                }
                else{
                    WindowManager manager = (WindowManager) getSystemService(WINDOW_SERVICE);
                    Display display = manager.getDefaultDisplay();
                    Point point = new Point();
                    display.getSize(point);

                    int width = point.x;
                    int height = point.y;

                    int dimen = width < height ? width : height;
                    dimen = dimen * 3 / 4;
                }

            }
        });
    }
}