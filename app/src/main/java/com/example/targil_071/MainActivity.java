package com.example.targil_071;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   EditText edN;
   float n1,n2,ans;
   int num;
   String st;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edN=findViewById(R.id.edN);
    }

    public void credits(View view) {
        edN.getText().clear();
        st = String.valueOf(ans);
        Intent si=new Intent(this,credi.class);
        si.putExtra("c",st);
        startActivity(si);
    }

    public void clear(View view) {
        edN.getText().clear();
    }

    public void shave(View view) {
        st=edN.getText().toString();
        if(st.isEmpty())
            Toast.makeText(this,"please enter a number",Toast.LENGTH_SHORT).show();
        else {
            edN.getText().clear();
            n2 = Float.parseFloat(st);
            if (num == 1)  //plus
                ans = n1 + n2;
            else if (num == 2)  //hisor
                ans = n1 - n2;
            else if (num == 3) //kefel
                ans = n1 * n2;
            else if (num == 4) //hilok
                ans = n1 / n2;
            else if(num==0)
                ans=n2;
            edN.setText("" + ans);
            num=0;
          }
        }

    public void hilok(View view) {
        num=4;
        st=edN.getText().toString();
        if(st.isEmpty())
            Toast.makeText(this,"please enter a number",Toast.LENGTH_SHORT).show();
        else {
            edN.getText().clear();
            n1 = Float.parseFloat(st);
        }
    }

    public void kefel(View view) {
        num=3;
        st=edN.getText().toString();
        if(st.isEmpty())
            Toast.makeText(this,"please enter a number",Toast.LENGTH_SHORT).show();
        else {
            edN.getText().clear();
            n1 = Float.parseFloat(st);
        }
    }

    public void hisor(View view) {
        num=2;
        st=edN.getText().toString();
        if(st.isEmpty())
            Toast.makeText(this,"please enter a number",Toast.LENGTH_SHORT).show();
        else {
            edN.getText().clear();
            n1 = Float.parseFloat(st);
        }
    }

    public void plus(View view) {
        num=1;
        st=edN.getText().toString();
        if(st.isEmpty())
          Toast.makeText(this,"please enter a number",Toast.LENGTH_SHORT).show();
        else {
            edN.getText().clear();
            n1 = Float.parseFloat(st);
        }
    }
}