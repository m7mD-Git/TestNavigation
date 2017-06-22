package com.qalex.testnavigation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SignUpActivity1 extends AppCompatActivity {

    TextView createAccount;
    Button signUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up1);
        Initialization();
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(SignUpActivity1.this,PlaceDetails.class);
                startActivity(i);
            }
        });

        createAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(SignUpActivity1.this,SignInActivity.class);
                startActivity(i);
            }
        });

    }

    private void Initialization() {
        signUp=(Button)findViewById(R.id.signUpButton);
        createAccount=(TextView)findViewById(R.id.CreateAccount);
    }
}
