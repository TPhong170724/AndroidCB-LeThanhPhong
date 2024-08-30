package com.example.xuc_xac;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView edt_view;
    private Button btn_Do;
    private Random random;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        edt_view=findViewById(R.id.edt_view);
        btn_Do=findViewById(R.id.btn_Do);
        random = new Random();
        btn_Do.setOnClickListener(v-> generateRandomNumber());
    }
    private void generateRandomNumber() {
        int randomNumber = random.nextInt(6) + 1; // Tạo số ngẫu nhiên từ 1 đến 6
        edt_view.setText(String.valueOf(randomNumber));
    }
}