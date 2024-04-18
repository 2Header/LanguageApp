package com.example.quiz_1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class OnBordActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_bord1);
    }
    public void onClickNext(View view){
        Intent i = new Intent(OnBordActivity1.this, OnBordActivity2.class);
        startActivity(i);

    }
    public void onClickSkip(View view){
        Intent i = new Intent(OnBordActivity1.this, LoginActivity.class);
        startActivity(i);

    }
}