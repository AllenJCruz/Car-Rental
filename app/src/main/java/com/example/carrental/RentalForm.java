package com.example.carrental;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class RentalForm extends AppCompatActivity {

        EditText etFname1;
        EditText etLname1;
        EditText etPhone1;
        EditText etaddress1;
        EditText etaddress2;
        EditText etdate1;
        EditText etdate2;
        Button btProceed;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_rental_form);

        etFname1 = findViewById(R.id.etFname1);
        etLname1 = findViewById(R.id.etLname1);
        etPhone1 = findViewById(R.id.etPhone1);
        etaddress1 = findViewById(R.id.etaddress1);
        etaddress2 = findViewById(R.id.etaddress2);
        etdate1 = findViewById(R.id.etdate1);
        etdate2 = findViewById(R.id.etdate2);
        btProceed = findViewById(R.id.btProceed);

        btProceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RentalForm.this, RentalForm2.class);
                startActivity(intent);
            }


        });


    }
}