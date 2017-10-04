package com.example.kishorebaktha.assignment;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class Delete extends AppCompatActivity {
    EditText t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete);
        t1=(EditText)findViewById(R.id.del);
    }
    public void del(View v)
    {
        String name=t1.getText().toString();
        String type="DELETE";
        BackgroundWriter backgroundWorker=new BackgroundWriter(this);
        backgroundWorker.execute(type,name);
    }
}
