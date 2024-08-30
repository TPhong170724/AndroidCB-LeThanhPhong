package com.example.firstprogram;

import android.content.Context;
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

public class MainActivity extends AppCompatActivity {
    EditText edtA,edtB;
    Button btn_Tinh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        // ánh xạ id
        edtA=findViewById(R.id.edtA);
        edtB=findViewById(R.id.edtB);
        btn_Tinh =findViewById(R.id.btn_Tinh);
        // lấy dữ liệu
        btn_Tinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent =new Intent(MainActivity.this,Trang2.class);
                // lấy dữ liệu a,b
                int a = Integer.parseInt(edtA.getText().toString());
                int b = Integer.parseInt(edtB.getText().toString());
                // đóng gói a,b
                Bundle mybundle=new Bundle();
                mybundle.putInt("soa",a);
                mybundle.putInt("sob",b);
                //cho bundle vào intent
                myintent.putExtra("data",mybundle);
                // khởi động
                startActivity(myintent);
            }
        });
    }
}
public class Trang2 extends AppCompatActivity {
    Button btn_Back;
    TextView edt_view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_trang2);
        //ánh xạ id
        edt_view=findViewById(R.id.edt_view);
        btn_Back=findViewById(R.id.btn_Back);
        // lấy dữ liệu
        Intent myintent = getIntent();
        // lấy bundle
        Bundle bundle = myintent.getBundleExtra("data");
        //lấy dữ liệu khỏi bundle
        int a=bundle.getInt("soa");
        int b = bundle.getInt("soa");
        int nghiem = a+b;
        edt_view.setText(nghiem);

    }
}

public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.example.giai_pt", appContext.getPackageName());
    }
}
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }
}