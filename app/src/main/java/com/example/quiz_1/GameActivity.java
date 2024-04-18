package com.example.quiz_1;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class GameActivity extends AppCompatActivity {

    private AppCompatButton btnAnswer1;
    private AppCompatButton btnAnswer2;
    private AppCompatButton btnAnswer3;
    private AppCompatButton btnAnswer4;

    private String selectedAnsw = "";

    private AppCompatButton btnCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_game);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        final ImageView btnBack2 = findViewById(R.id.btnBack2);
        btnAnswer1 = findViewById(R.id.btnAnsw1);
        btnAnswer2 = findViewById(R.id.btnAnsw2);
        btnAnswer3 = findViewById(R.id.btnAnsw3);
        btnAnswer4 = findViewById(R.id.btnAnsw4);
        btnCheck = findViewById(R.id.btnCheck2);

        btnAnswer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedAnsw = "муха";
                btnAnswer1.setBackgroundResource(R.drawable.round_back_blue);
                btnAnswer1.setTextColor(Color.parseColor("#FFFFFF"));
                btnAnswer2.setBackgroundResource(R.drawable.round_back_gray);
                btnAnswer2.setTextColor(Color.parseColor("#000000"));
                btnAnswer3.setBackgroundResource(R.drawable.round_back_gray);
                btnAnswer3.setTextColor(Color.parseColor("#000000"));
                btnAnswer4.setBackgroundResource(R.drawable.round_back_gray);
                btnAnswer4.setTextColor(Color.parseColor("#000000"));
            }
        });

        btnAnswer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedAnsw = "садовник";
                btnAnswer1.setBackgroundResource(R.drawable.round_back_gray);
                btnAnswer1.setTextColor(Color.parseColor("#000000"));
                btnAnswer2.setBackgroundResource(R.drawable.round_back_blue);
                btnAnswer2.setTextColor(Color.parseColor("#FFFFFF"));
                btnAnswer3.setBackgroundResource(R.drawable.round_back_gray);
                btnAnswer3.setTextColor(Color.parseColor("#000000"));
                btnAnswer4.setBackgroundResource(R.drawable.round_back_gray);
                btnAnswer4.setTextColor(Color.parseColor("#000000"));
            }
        });

        btnAnswer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedAnsw = "гладиолус";
                btnAnswer1.setBackgroundResource(R.drawable.round_back_gray);
                btnAnswer1.setTextColor(Color.parseColor("#000000"));
                btnAnswer2.setBackgroundResource(R.drawable.round_back_gray);
                btnAnswer2.setTextColor(Color.parseColor("#000000"));
                btnAnswer3.setBackgroundResource(R.drawable.round_back_blue);
                btnAnswer3.setTextColor(Color.parseColor("#FFFFFF"));
                btnAnswer4.setBackgroundResource(R.drawable.round_back_gray);
                btnAnswer4.setTextColor(Color.parseColor("#000000"));
            }
        });

        btnAnswer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedAnsw = "собака";
                btnAnswer1.setBackgroundResource(R.drawable.round_back_gray);
                btnAnswer1.setTextColor(Color.parseColor("#000000"));
                btnAnswer2.setBackgroundResource(R.drawable.round_back_gray);
                btnAnswer2.setTextColor(Color.parseColor("#000000"));
                btnAnswer3.setBackgroundResource(R.drawable.round_back_gray);
                btnAnswer3.setTextColor(Color.parseColor("#000000"));
                btnAnswer4.setBackgroundResource(R.drawable.round_back_blue);
                btnAnswer4.setTextColor(Color.parseColor("#FFFFFF"));

            }
        });

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (selectedAnsw.isEmpty()){
                    Toast.makeText(GameActivity.this, "Выбирете вариант ответа", Toast.LENGTH_SHORT).show();
                } else{
                    Intent intent = new Intent(GameActivity.this, GameResActivity.class);
                    intent.putExtra("selectedAnsw", selectedAnsw);
                    startActivity(intent);
                    finish();
                }

            }
        });
        btnBack2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GameActivity.this, MainActivity.class));
                finish();
            }
        });
    }
}
