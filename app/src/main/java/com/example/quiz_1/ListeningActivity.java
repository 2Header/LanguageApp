package com.example.quiz_1;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.Locale;

public class ListeningActivity extends AppCompatActivity {

    private AppCompatButton btnCheck;
    private EditText userText;

    private String Answ = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_listening);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        btnCheck = findViewById(R.id.btnCheckText);

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (userText.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(), "Нашите ответ", Toast.LENGTH_SHORT).show();
                } else {
                    Answ = userText.getText().toString();
                    Intent intent = new Intent(ListeningActivity.this, ListeningResActivity.class);
                }
            }
        });
    }
    private void init(){
        userText = findViewById(R.id.userText3);
    }
    public void speak(View view){
        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());
        startActivityForResult(intent, 10);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK && data != null){
            switch (resultCode){
                case 10:
                    ArrayList<String> text = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    userText.setText(text.get(0));
                    textCheck(text.get(0));
                    break;
            }
        }
    }
    private void textCheck(String text){
            Answ = text;
            Intent intent = new Intent(ListeningActivity.this, ListeningResActivity.class);
            finish();
        }

}