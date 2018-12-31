package com.example.jbt.helloworldapplication;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getIntent().getExtras().getString("key");

        if (savedInstanceState != null) {
            String message = savedInstanceState.getString("message");
            Toast.makeText(this, message, Toast.LENGTH_LONG).show();
        }

        Log.d("myTAg","dddd");



    }



    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putString("message", "This is my message to be reloaded");
        super.onSaveInstanceState(outState);
    }

}
