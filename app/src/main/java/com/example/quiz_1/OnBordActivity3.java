package com.example.quiz_1;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class OnBordActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_bord3);
    }

    public void onClickNext(View view){
        Intent i = new Intent(OnBordActivity3.this, LoginActivity.class);
        startActivity(i);

    }
    public void onClickSkip(View view){
        Intent i = new Intent(OnBordActivity3.this, LoginActivity.class);
        startActivity(i);

    }
}