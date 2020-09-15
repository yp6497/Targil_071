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

        //a=gi.getIntExtra("c", -1);
        //st = Intent.getStringExtra("m");
        //st=ed.getText().toString();
        //a = Integer.parseInt(st);
        //if(a!='a')
        //  t.setText(""+st);
        //else
        //  t.setText("");



    }


    public void end(View view) {
        finish();
    }
}
