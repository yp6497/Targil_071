package com.example.targil_071;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class credi extends AppCompatActivity {

    Intent gi= getIntent();
    int ans= gi.getIntExtra("c",1);
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credi);
        t=findViewById(R.id.t);

        t.setText(ans);
    }

    public void end(View view) {
        finish();
    }
}