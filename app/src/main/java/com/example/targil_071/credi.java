package com.example.targil_071;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class credi extends AppCompatActivity {

    //TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credi);
        //Intent gi= getIntent();
        //
        //t=findViewById(R.id.t);
        //t.setText(ans);
        //t= (TextView) findViewById(R.id.t);

        //Intent gi = getIntent();
        //int x1=gi.getIntExtra("intVariableName", 0);
        //String t = gi.getStringExtra(Intent.EXTRA_TEXT);
        //String st=Integer.toString(x1);
        TextView t = (TextView) findViewById(R.id.t);
        //t.setText(st);
    }


    public void end(View view) {
        finish();
    }
}
