package com.randevu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class PersonalCaseActivity extends AppCompatActivity {
     Button continueButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personal_case);
        init();
    }

    private void init() {
    continueButton=findViewById(R.id.personalCaseContinueButton);
    }

    public void onClickContinue(View view) {
        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
    }

}