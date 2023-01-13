package com.example.sps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class AdminDActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        setContentView(R.layout.activity_admin_dactivity);
    }

    public void AddTPOActivity(View view) {
        Intent in = new Intent(getApplicationContext(), AddTPOActivity.class);
        startActivity(in);
    }

    public void AddStudentActivity(View view) {
        Intent in = new Intent(getApplicationContext(), AddStudentActivity.class);
        startActivity(in);
    }
}