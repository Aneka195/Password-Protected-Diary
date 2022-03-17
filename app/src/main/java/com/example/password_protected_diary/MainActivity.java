package com.example.password_protected_diary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TableLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void loginButtonClicked(View v){
        TableLayout loginSignUp = (TableLayout) findViewById(R.id.loginSignUp);
        loginSignUp.setVisibility(View.INVISIBLE);

    }

    public void signUpButtonClicked(View v){
        ConstraintLayout loginSignUp = (ConstraintLayout) findViewById(R.id.loginSignUp);
        ConstraintLayout register = (ConstraintLayout) findViewById(R.id.registerLayout);
        loginSignUp.setVisibility(View.INVISIBLE);
        register.setVisibility(View.VISIBLE);
    }
    public void registerButtonClicked(View v) {
        ConstraintLayout register = (ConstraintLayout) findViewById(R.id.registerLayout);
        ConstraintLayout firstScreen = (ConstraintLayout) findViewById(R.id.firstScreen);
        register.setVisibility(View.INVISIBLE);
        firstScreen.setVisibility(View.VISIBLE);
    }
}