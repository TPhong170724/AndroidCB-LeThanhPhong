package com.example.mes;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class call_phone extends AppCompatActivity {
    ImageButton btn_callPhone;
    EditText edtPhone;
    Button btn_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_call_phone);
        btn_back=findViewById(R.id.btn_back);
        btn_callPhone=findViewById(R.id.btn_callPhone);
        edtPhone=findViewById(R.id.edtPhone);
        btn_callPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //khởi tạo intent ẩn
                Intent callintent=new Intent(Intent.ACTION_CALL, Uri.parse("tel:"+edtPhone.getText().toString()));
                startActivity(callintent);
            }
        });
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}