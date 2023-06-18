package com.example.easyfixit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class LoginPhoneNumberEntry extends AppCompatActivity {

    private Button eContinueBtn;
    private TextInputLayout ePhoneNumberEnter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_phone_number_entry);

        eContinueBtn = findViewById(R.id.continueBtn);
        ePhoneNumberEnter = findViewById(R.id.phoneNumberEnter);

        eContinueBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!ePhoneNumberEnter.getEditText().getText().toString().trim().isEmpty()) {
                    if (ePhoneNumberEnter.getEditText().getText().toString().trim().length() == 10) {

                        Intent intent = new Intent(getApplicationContext(), OTP_Code.class);
                        intent.putExtra("mobile", ePhoneNumberEnter.getEditText().getText().toString().trim());
                        startActivity(intent);

                    } else {
                        Toast.makeText(LoginPhoneNumberEntry.this, "Please Enter Correct Number", Toast.LENGTH_SHORT).show();
                    }
                }else {
                    Toast.makeText(LoginPhoneNumberEntry.this, "Please Enter Correct Number ", Toast.LENGTH_SHORT).show();
                }


            }
        });
    }


}