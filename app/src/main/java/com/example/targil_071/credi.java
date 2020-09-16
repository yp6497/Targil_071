package com.example.targil_071;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class credi extends AppCompatActivity {

    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credi);
        t= findViewById(R.id.t);
        ans();

    }

    private void ans() {

        t = findViewById(R.id.t);
        Intent gi = getIntent();
        String str = gi.getStringExtra("c");
        t.setText("The answer to the last result is: "+str);
    }

    public void end(View view) {
        finish();
    }
}
