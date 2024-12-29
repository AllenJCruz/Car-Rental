package com.example.carrental;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class SignUp extends AppCompatActivity {
    EditText etPassword;
    EditText etEmail;
    TextView textView4;
    TextView textView5;
    Button btsignup1;
    private DBHelper mydb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sign_up);


        etPassword = findViewById(R.id.etPassword);
        etEmail = findViewById(R.id.etEmail);
        btsignup1 = findViewById(R.id.btsignup1);
        mydb = new DBHelper(this);

    }
    public void signup(View view) {
        btsignup1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean checkInsert = mydb.insertUsers(etEmail.getText().toString(), etPassword.getText().toString());
                if (checkInsert) {
                    Toast.makeText(SignUp.this,"Welcome!, New User", Toast.LENGTH_LONG).show();
                    //Intent intent = new Intent(SignUp.this, LogIn.class);
                    //startActivity(intent);
                } else {
                    Toast.makeText(SignUp.this, "Something went wrong", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

}
