package com.example.ogan.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


import java.util.Random;

public class MainActivity extends AppCompatActivity {

         int RandomNumber;
         Random randomGenerator = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RandomNumber = randomGenerator.nextInt(11) + 10;
        System.out.println(RandomNumber);
    }


    public void Guessing(View view){
        EditText guessedNumber = (EditText) findViewById(R.id.userInput);
        try {
            int number = Integer.parseInt(guessedNumber.getText().toString());
            if (number < RandomNumber) {
                Toast.makeText(getApplicationContext(), "Your number is lower", Toast.LENGTH_LONG).show();
            } else if (number > RandomNumber) {
                Toast.makeText(getApplicationContext(), "Your number is higher", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(getApplicationContext(), "Correct! Congratulations \uD83D\uDC4F \uD83D\uDC4D", Toast.LENGTH_LONG).show();
                RandomNumber = randomGenerator.nextInt(11) + 10;
            }
        } catch (Exception e){
            Toast.makeText(getApplicationContext(),"Invalid number",Toast.LENGTH_LONG).show();
        }

    }

}
