package com.example.sps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        setContentView(R.layout.activity_main);
    }

    public void CallAdminActivity(View view){
        Intent in  = new Intent(getApplicationContext(), AdminActivity.class);
        startActivity(in);
    }

    public void callTPOActivity(View view){
        Intent in  = new Intent(getApplicationContext(), TPOActivity.class);
        startActivity(in);
    }

    public void callStudentActivity(View view){
        Intent in  = new Intent(getApplicationContext(), StudentActivity.class);
        startActivity(in);
    }
}