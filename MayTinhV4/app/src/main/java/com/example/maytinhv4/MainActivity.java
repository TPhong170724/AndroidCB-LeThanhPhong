package com.example.maytinhv4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button btnCong,btnTru,btnNhan,btnChia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        btnCong=findViewById(R.id.btnCong);
        btnTru=findViewById(R.id.btnTru);
        btnNhan=findViewById(R.id.btnNhan);
        btnChia=findViewById(R.id.btnChia);
        btnCong.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                Intent intenplus=new Intent(MainActivity.this,Trang2.class);
                intenplus.putExtra("operator","plus");
                startActivity(intenplus);
            }
        });
        btnTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intenttru=new Intent(MainActivity.this,Trang2.class);
                startActivity(intenttru);
            }
        });

    }
}