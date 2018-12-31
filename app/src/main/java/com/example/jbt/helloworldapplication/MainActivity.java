package com.example.jbt.helloworldapplication;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        outState.putChar("key",'d');
    }

    public void goToB(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("key",1);
        startActivity(intent);
    }
}
