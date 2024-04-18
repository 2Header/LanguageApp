package com.example.quiz_1;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ListeningResActivity extends AppCompatActivity {

    private EditText userText;
    private AppCompatButton btnNext3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listening_res);
        btnNext3 = findViewById(R.id.btnNext3);
        userText = findViewById(R.id.userText3);
        final ImageView btnBack1 = findViewById(R.id.btnBack1);
        btnBack1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ListeningResActivity.this, ListeningActivity.class));
                finish();
            }
        });

        final String answer = getIntent().getStringExtra("answer");
        System.out.println(answer);

        if (answer.equals("cucumber")){
            userText.setText(answer);
            userText.setTextColor(Color.parseColor("#5ba890"));
        }else{
            userText.setText(answer);
            userText.setTextColor(Color.parseColor("#d6185d"));
        }
        btnNext3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ListeningResActivity.this, MainActivity.class));
            }
        });
    }
}