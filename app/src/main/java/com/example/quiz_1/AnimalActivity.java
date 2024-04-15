package com.example.quiz_1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AnimalActivity extends AppCompatActivity {
    private AppCompatButton btnCheck;
    private EditText userText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_animal);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        final ImageView btnBack1 = findViewById(R.id.btnBack1);
        btnCheck = findViewById(R.id.btnCheck1);
        userText = findViewById(R.id.userText1);

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (userText.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(), "Нашите ответ", Toast.LENGTH_SHORT).show();
                } else { if (userText.getText().toString().toLowerCase().equals("cat")){
                    startActivity(new Intent(AnimalActivity.this, CompletedActivity.class));
                }else{
                    startActivity(new Intent(AnimalActivity.this, UnsucsessActivity.class));
                }

                }
            }
        });


        btnBack1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AnimalActivity.this, MainActivity.class));
                finish();
            }
        });
    }

}