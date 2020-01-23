package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textView = findViewById(R.id.text_view);
    }

    public void Calculator(View view) {
        startActivity(new Intent(this,MainActivity.class));
    }

    public void Result(View view) {
        Intent intent = getIntent();
        String getInt = intent.getStringExtra("Key");
        textView.setText(getInt);
    }
}
