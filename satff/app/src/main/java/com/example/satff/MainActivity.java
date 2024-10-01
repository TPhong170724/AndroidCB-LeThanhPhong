package com.example.satff;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceActivity;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Handler handler;
    private ImageView icon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        icon=findViewById(R.id.icon);
        int[] Colors= {
                Color.RED,Color.YELLOW,Color.GREEN,
                Color.BLUE,Color.MAGENTA,Color.GRAY
        };
        int[] Icons={
                R.drawable.icon1,R.drawable.icon2
        };
        Random random=new Random();
        int randomColor = Colors[random.nextInt(Colors.length)];
        int randomIcon = Icons[random.nextInt(Icons.length)];

        // Thiết lập màu nền
        findViewById(R.id.main).setBackgroundColor(randomColor);
        icon.setImageResource(randomIcon);
        handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent myintent=new Intent(MainActivity.this,Profile.class);
                startActivity(myintent);
                finish();
            }
        },2000);


    }
}