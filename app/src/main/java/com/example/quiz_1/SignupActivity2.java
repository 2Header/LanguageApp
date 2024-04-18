package com.example.quiz_1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SignupActivity2 extends AppCompatActivity {

    EditText edPassword, edPassword2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup2);
        init();
        final ImageView btnBack1 = findViewById(R.id.btnBack1);

        btnBack1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SignupActivity2.this, SignupActivity.class));
                finish();
            }
        });
    }

    public void init(){
        edPassword = findViewById(R.id.edPassword);
        edPassword2 = findViewById(R.id.edPassword2);
    }

    public void onClickSignUp(View view) {
        try {
            if (edPassword.getText().toString().equals(edPassword2.getText().toString())) {
                Intent i = new Intent(SignupActivity2.this, LanguageActivity.class);
                startActivity(i);
            } else {
                Toast.makeText(getApplicationContext(), "Wrong password", Toast.LENGTH_SHORT).show();
            }
        }catch (Exception exception){
            Toast.makeText(getApplicationContext(), "Wrong password", Toast.LENGTH_SHORT).show();
        }
    }
}