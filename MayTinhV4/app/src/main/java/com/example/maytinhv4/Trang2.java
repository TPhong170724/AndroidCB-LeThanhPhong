package com.example.maytinhv4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Trang2 extends AppCompatActivity {
EditText edtSoA,edtSoB;
Button btnThucHien,btnDong;
TextView twKetQua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_trang2);
        edtSoA=findViewById(R.id.edtSoA);
        edtSoB=findViewById(R.id.edtSoB);
        btnThucHien=findViewById(R.id.btnThucHien);
        twKetQua=findViewById(R.id.twKetQua);
        Intent intent1=getIntent();
        String operator= intent1.getStringExtra("operator");
        btnThucHien.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                float a=Float.parseFloat(edtSoA.getText().toString());
                float b=Float.parseFloat(edtSoB.getText().toString());
                if(operator.equals("plus")){
                    float tong=a+b;
                    twKetQua.setText(tong+" ");
                }
            }
        });
    }
}