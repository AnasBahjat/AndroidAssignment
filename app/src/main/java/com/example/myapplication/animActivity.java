package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class animActivity extends AppCompatActivity {

    private Animation top, bottom;
    private ImageView imageView;
    private TextView textView;
    @SuppressLint({"ResourceType", "MissingInflatedId"})
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.anim_file);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        top = AnimationUtils.loadAnimation(this, R.drawable.top);
        bottom = AnimationUtils.loadAnimation(this, R.drawable.bottom);

        imageView=findViewById(R.id.imgViewAnim);
        textView=findViewById(R.id.txtViewAnim);

        imageView.setAnimation(top);
        textView.setAnimation(bottom);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(animActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },3000);

    }
}
