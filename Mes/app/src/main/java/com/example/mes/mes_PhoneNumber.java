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

public class mes_PhoneNumber extends AppCompatActivity {
    ImageButton btn_sms;
    Button btn_Thoat;
    EditText edtmes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_mes_phone_number);
       edtmes=findViewById(R.id.edtmes);
       btn_sms=findViewById(R.id.btn_sms);
       btn_Thoat=findViewById(R.id.btn_Thoat);
       btn_sms.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent smsintent=new Intent(Intent.ACTION_SENDTO, Uri.parse("smsto"+edtmes.getText().toString()));
               startActivity(smsintent);
           }
       });
       btn_Thoat.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               finish();
           }
       });
    }
}