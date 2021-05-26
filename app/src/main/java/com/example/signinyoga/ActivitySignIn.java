package com.example.signinyoga;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

public class ActivitySignIn extends AppCompatActivity {
    private LinearLayout lnSignInWithEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        lnSignInWithEmail = findViewById(R.id.ln_sign_in_with_email);
        lnSignInWithEmail.setOnClickListener(v -> {
            Intent intent = new Intent(ActivitySignIn.this, SignInWithEmail.class);
            startActivity(intent);
        });
    }
}