package com.example.android.tipcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent myIntent = getIntent();
        TextView textView = findViewById(R.id.text_view);

        double amount = myIntent.getDoubleExtra("Bill Amount: ", 0);
        double taxPer = myIntent.getDoubleExtra("Tax Percentage: ", 0);
        double tipPer = myIntent.getDoubleExtra("Tip Percentage: ", 0);
        double amountPlusTax = amount + taxPer;
        double combinedAmount = amountPlusTax + tipPer;
        double total = myIntent.getDoubleExtra("Grand Total: ", combinedAmount);
        String totalAmount = Double.toString(total);

        textView.setText(String.format("Total: %s\n" +
                "Sales Tax: %s\n" +
                "Tip: %s\n" +
                "Grand Total: %s", amount, taxPer, tipPer, totalAmount));

    }


}
