package com.dev.gabriel.cofeeorderingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    public final int coffePrice = 2;
    public int finalPrice = 0;
    public String username;
    public int coffeeCups;
    public TextView finalPriceText;
    public EditText nameTextbox;
    public EditText coffeeCupsTextbox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameTextbox = (EditText) findViewById(R.id.nameTextBox);
        coffeeCupsTextbox = (EditText) findViewById(R.id.coffeeCupsTextbox);
        Button orderButton = (Button) findViewById(R.id.orderButton);
        finalPriceText = (TextView) findViewById(R.id.finalPrice);

        orderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                username = nameTextbox.getText().toString();
                coffeeCups = Integer.parseInt(coffeeCupsTextbox.getText().toString());

                finalPrice = coffePrice * coffeeCups;

                finalPriceText.setText("$ " + finalPrice + " for " + username);

            }
        });
    }
}
