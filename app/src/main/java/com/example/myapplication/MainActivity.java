package com.example.myapplication;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myapplication.R.id;
import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        EditText t1 = findViewById(R.id.editTextEmail);
        EditText t2 = findViewById(R.id.editTextPassword);

        TextView stat = (TextView)findViewById(R.id.status);

        final Button button = (Button) findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String email = String.valueOf(t1.getText());
                String password = String.valueOf(t2.getText());
                if (email.equals("fuadnuri12@gmail.com") && password.equals("fuad")) {
                    stat.setText("you are in ");
                }
                else{
                    stat.setText("you are not in");
                }
                t1.setText("");
                t2.setText("");
            }
        });
    }


}