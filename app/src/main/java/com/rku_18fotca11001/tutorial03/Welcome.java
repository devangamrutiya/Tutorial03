package com.rku_18fotca11001.tutorial03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Welcome extends AppCompatActivity {
    TextView txtwelcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("welcome");
        txtwelcome = findViewById(R.id.txtWelcome);
        txtwelcome.setText("welcome,"+name);

    }
}