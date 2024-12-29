package com.example.carrental;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LogIn extends AppCompatActivity {

    TextView tvusername,tvpassword,attepmts;
    EditText editTextusername,editTextPassword;
    Button btLogin1;
    int counter = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_log_in);

        tvusername = findViewById(R.id.tvusername);
        tvpassword = findViewById(R.id.tvpassword);
        editTextusername = findViewById(R.id.editTextusername);
        editTextPassword = findViewById(R.id.editTextPassword);
        attepmts = findViewById(R.id.attepmts);
        btLogin1 = findViewById(R.id.btLogin1);

        btLogin1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(editTextusername.getText().toString().equals("admin") &&
                        editTextPassword.getText().toString().equals("admin")) {
                    Toast.makeText(getApplicationContext(),
                            "Redirecting to Rental Form",Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(LogIn.this, RentalForm.class);
                    startActivity(intent);
                }
                else if(editTextusername.getText().toString().equals("allen") &&editTextPassword.getText().toString().equals("allen")){
                    Toast.makeText(getApplicationContext(),
                            "Redirecting to Rental Form",Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(LogIn.this, RentalForm.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(getApplicationContext(),
                            "Wrong Credentials",Toast.LENGTH_LONG).show();
                    attepmts.setVisibility(View.VISIBLE);
                    counter--;
                    attepmts.setText(Integer.toString(counter));
                    if(counter==0){
                        btLogin1.setEnabled(false);
                    }
                }





            }
            });

    }
}