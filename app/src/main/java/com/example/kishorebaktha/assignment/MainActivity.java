package com.example.kishorebaktha.assignment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(EditText)findViewById(R.id.et1);
        t2=(EditText)findViewById(R.id.et2);
    }
    public void click(View v)
    {
        String s1=t1.getText().toString();
        String s2=t2.getText().toString();
        if(s2.equals("admin")&&s1.equals("123"))
        {
            startActivity(new Intent(this,MainActivity2.class));
        }
        else
        {
            Toast.makeText(this,"INVALID LOGIN",Toast.LENGTH_SHORT).show();
            t1.setText("");
            t2.setText("");
        }
    }

}