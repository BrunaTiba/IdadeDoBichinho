package com.example.bruna.idadedobichinho;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void irTelaDog (View view){
        Intent intent1 = new Intent(getApplicationContext(),DogActivity.class);
        startActivity(intent1);
    }

    public void irTelaCat (View view){
        Intent intent2 = new Intent(getApplicationContext(),CatActivity.class);
        startActivity(intent2);
    }




}
