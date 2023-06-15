package com.example.easyfixit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class OTP_Code extends AppCompatActivity {

    private ImageView eBack;
    private EditText eInputotp1,eInputotp2,eInputotp3,eInputotp4,eInputotp5,eInputotp6;
    private TextView eResendCode, eUserPhoneNumber;
    private Button eSubmit;

    //variable that is used such that, the resend code can only be activated after sixty seconds
    private boolean resendEnable = false;
    private int resendTime = 60;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_code);

        eBack = findViewById(R.id.back);

        eInputotp1 = findViewById(R.id.inputotp1);
        eInputotp2 = findViewById(R.id.inputotp2);
        eInputotp3 = findViewById(R.id.inputotp3);
        eInputotp4 = findViewById(R.id.inputotp4);
        eInputotp5 = findViewById(R.id.inputotp5);
        eInputotp6 = findViewById(R.id.inputotp6);

        eResendCode = findViewById(R.id.resendCode);
        eUserPhoneNumber = findViewById(R.id.userPhoneNumber);
        eUserPhoneNumber.setText(String.format(getIntent().getStringExtra("mobile")));

        eSubmit = findViewById(R.id.submit);

        //close button functionality, to return to the mobile number entry page
        eBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), LoginPhoneNumberEntry.class));
            }
        });

        eSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), HomePage.class));
            }
        });

        //after filling the first editText out of six, the focus should automatically go to the second
        //Hence, creating a method which contains all the details for such actions
        numberOtpMove();

        //calling countDown timer method which waits till 60 second to activate resend code option
        startCountDownTimer();
    }

    //method to change the focus from each otp textField
    private void numberOtpMove()
    {
        //Once, the first editText is filled, it showed focus on the second one
        eInputotp1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (!s.toString().trim().isEmpty())
                {
                    eInputotp2.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //Once, the Second editText is filled, it showed focus on the third one
        eInputotp2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (!s.toString().trim().isEmpty())
                {
                    eInputotp3.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //Once, the Third editText is filled, it showed focus on the fourth one
        eInputotp3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (!s.toString().trim().isEmpty())
                {
                    eInputotp4.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //Once, the Fourth editText is filled, it showed focus on the fifth one
        eInputotp4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (!s.toString().trim().isEmpty())
                {
                    eInputotp5.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //Once, the Fifth editText is filled, it showed focus on the sixth one
        eInputotp5.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (!s.toString().trim().isEmpty())
                {
                    eInputotp6.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //since, after sixth editText, there is no other field, so no code for eInputOtp6 is written
    }

    //method to create a countdown such that the resend option can be activated after 60 seconds
    private void startCountDownTimer()
    {
        resendEnable = false;
        eResendCode.setTextColor(Color.parseColor("#99000000"));

        new CountDownTimer(resendTime*1000, 1000)
        {

            @Override
            public void onTick(long millisUntilFinished) {
                eResendCode.setText("Resend Code ("+(millisUntilFinished/1000)+")");
            }

            @Override
            public void onFinish() {
                resendEnable = true;
                eResendCode.setText("Resend Code");
                eResendCode.setTextColor(Color.parseColor("#E46138"));

                eResendCode.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(), LoginPhoneNumberEntry.class));
                    }
                });

            }
        }.start();
    }
}