package com.example.demo_costrain;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText edtA,edtB,edtKQ;
    Button btn_Tong,btn_Tru,btn_Nhan,btn_Chia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

            edtA = findViewById(R.id.edtA);
            edtB = findViewById(R.id.edtB);
            edtKQ = findViewById(R.id.edtKQ);
            btn_Tong = findViewById(R.id.btn_Tong);
            btn_Tru=findViewById(R.id.btn_Tru);
            btn_Chia=findViewById(R.id.btn_Chia);
            btn_Nhan=findViewById(R.id.btn_Nhan);
            btn_Tong.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int a = Integer.parseInt(edtA.getText().toString());
                    int b = Integer.parseInt(edtB.getText().toString());
                    int c = a + b;
                    edtKQ.setText(c + "");
                }
            });
            btn_Tru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(edtA.getText().toString());
                int b = Integer.parseInt(edtB.getText().toString());
                int c = a - b;
                edtKQ.setText(c + "");
                }
            });
            btn_Nhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(edtA.getText().toString());
                int b = Integer.parseInt(edtB.getText().toString());
                int c = a *b;
                edtKQ.setText(c + "");
                }
            });
            btn_Chia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(edtA.getText().toString());
                int b = Integer.parseInt(edtB.getText().toString());
                int c = a / b;
                edtKQ.setText(c + "");
                }
            });
    }
}