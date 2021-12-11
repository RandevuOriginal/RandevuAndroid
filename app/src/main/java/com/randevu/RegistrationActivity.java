package com.randevu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class RegistrationActivity extends AppCompatActivity {
    private Button continueButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration);
        init();
    }

    private void init() {
continueButton=findViewById(R.id.registrationLayoutContinueButton);
    }

    public void onClickContinue(View view) {
            Intent intent = new Intent(this, PersonalCaseActivity.class);
            startActivity(intent);
    }

}


