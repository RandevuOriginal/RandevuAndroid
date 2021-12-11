package com.randevu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText emailText, passwordText;
    private Button signIn,signUp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init()
    {
        signIn = findViewById(R.id.activityMainSignInButton);
        signUp = findViewById(R.id.activityMainSignUpButton);
        emailText = findViewById(R.id.activityMainEmail);
        passwordText= findViewById(R.id.activityMainPassword);
    }

    public void onClickSignIn(View view) {
        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
    }

    public void onClickSignUp(View view) {
        Intent intent = new Intent(this, RegistrationActivity.class);
        startActivity(intent);
    }


    public void signin(String email , String password) {

    }


    public void registration (String email , String password){

    }
}