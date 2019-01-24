package com.example.android.miwokk;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView numbers = (TextView) findViewById(R.id.numbers);

// Set a click listener on that View
        numbers.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(numbersIntent);
            }
        });
        TextView family = (TextView) findViewById(R.id.family);

// Set a click listener on that View
        family.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, FamilyMembers.class);
                startActivity(numbersIntent);
            }
        });
         TextView colors = (TextView) findViewById(R.id.colors);

// Set a click listener on that View
        colors.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(numbersIntent);
            }
        });
        TextView phrases = (TextView) findViewById(R.id.phrases);

// Set a click listener on that View
        phrases.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(numbersIntent);
            }
        });
    }
 /*  public void openNumberList(View view)
    {
        Intent intent =new Intent(this,Main2Activity.class);
        startActivity(intent);
    }
    public void openFamilyList(View view)
    {
        Intent intent =new Intent(this,FamilyMembers.class);
        startActivity(intent);
    }
    public void openColorsList(View view)
    {
        Intent intent =new Intent(this,ColorsActivity.class);
        startActivity(intent);
    }
    public void openPhrasesList(View view)
    {
        Intent intent =new Intent(this,PhrasesActivity.class);
        startActivity(intent);
    }*/
}
