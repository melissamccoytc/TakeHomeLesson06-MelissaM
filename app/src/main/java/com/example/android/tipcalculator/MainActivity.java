package com.example.android.tipcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText billAmount = findViewById(R.id.bill_amount);
        final EditText taxPercentage = findViewById(R.id.tax_percentage);
        final EditText tipPercentage = findViewById(R.id.tip_percentage);
        Button submitButton = findViewById(R.id.submit_button);


        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double amount = Double.parseDouble(billAmount.getText().toString());
                double taxPer = Double.parseDouble(taxPercentage.getText().toString());
                double tipPer = Double.parseDouble(tipPercentage.getText().toString());


                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("Bill Amount: ", amount);
                intent.putExtra("Tax Percentage: ", (taxPer * 100));
                intent.putExtra("Tip Percentage: ", (tipPer * 100));
                startActivity(intent);
            }
        });
    }

}




