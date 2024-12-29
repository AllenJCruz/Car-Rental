package com.example.carrental;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class DocForm extends AppCompatActivity {

    TextView textView;
    TextView textView9;
    Button btBack1;
    Button btProceed2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_doc_form);

        textView = findViewById(R.id.textView);
        textView9 = findViewById(R.id.textView9);
        btBack1 = findViewById(R.id.btBack1);
        btProceed2 = findViewById(R.id.btProceed2);

        btBack1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DocForm.this, RentalForm2.class);
                startActivity(intent);
            }
        });
        btProceed2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DocForm.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}