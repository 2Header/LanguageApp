package com.example.quiz_1;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

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
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_listening_res);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        btnNext3 = findViewById(R.id.btnNext3);
        final String Answ = getIntent().getStringExtra("Answ");

        if (Answ.equals("cucumber")){
            userText.setText(Answ);
            userText.setTextColor(Color.parseColor("#5ba890"));
        }else{
            userText.setText(Answ);
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