package com.example.carrental;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class RentalForm2 extends AppCompatActivity {

    EditText etpassenger;
    Spinner spinner;
    Spinner spinner2;
    Spinner spinner3;
    Button btProceed1;
    Button btBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_rental_form2);

        etpassenger = findViewById(R.id.etpassenger);
        spinner = findViewById(R.id.Payment);
        spinner2 = findViewById(R.id.VType);
        spinner3 = findViewById(R.id.VName);
        btBack = findViewById(R.id.btBack);
        btProceed1 = findViewById(R.id.btProceed1);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this,
                R.array.VType,
                android.R.layout.simple_spinner_item
        );


        btBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RentalForm2.this, RentalForm.class);
                startActivity(intent);
            }
        });

        btProceed1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RentalForm2.this, DocForm.class);
                startActivity(intent);
            }
        });


    }

    ;
}