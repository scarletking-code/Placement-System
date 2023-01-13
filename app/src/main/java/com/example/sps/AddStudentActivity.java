package com.example.sps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class AddStudentActivity extends AppCompatActivity {
    private Button button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        setContentView(R.layout.activity_add_student);

        addListenerOnButton();
    }

    private void addListenerOnButton() {
        button4 = (Button) findViewById(R.id.button4);

        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String feedbck = "Successful";
                Toast.makeText(getApplicationContext(),feedbck,Toast.LENGTH_LONG).show();
            }
        });
    }
}