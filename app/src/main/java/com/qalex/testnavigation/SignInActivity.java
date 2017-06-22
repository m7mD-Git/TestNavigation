package com.qalex.testnavigation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SignInActivity extends AppCompatActivity {

    Button signin;
    TextView createAccount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        initialization();
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(SignInActivity.this,MainActivity.class);
                startActivity(i);

            }
        });
        createAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(SignInActivity.this,SignUpActivity1.class);
                startActivity(i);
            }
        });
    }

    public void initialization(){
        signin=(Button)findViewById(R.id.signInButton);
        createAccount=(TextView)findViewById(R.id.CreateAccount);
    }

    @Override
    public void onBackPressed() {

        super.onBackPressed();
    this.finish();
    }
}
