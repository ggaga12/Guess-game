package com.example.pp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText entertxt;
    int randomNumber;

    public void  random() {
        Random random = new Random();
        randomNumber = random.nextInt(20) + 1;
    }

    public void guess(View view) {
        entertxt = (EditText) findViewById(R.id.entertxt);

        Integer guessNumber = Integer.parseInt(entertxt.getText().toString());
        String message = "";

        if(randomNumber < guessNumber) {
            message = "Yry lower number!";
        } else if (randomNumber > guessNumber) {

            message = "Try higher number!";
        } else {
            message = "You won!";


        }

        Log.i("Random Number", Integer.toString(randomNumber));
        Log.i("Guess Number", entertxt.getText().toString());

        Toast.makeText(this, message, Toast.LENGTH_LONG).show();



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        random();
    }
}
  