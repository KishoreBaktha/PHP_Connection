package com.example.kishorebaktha.assignment;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class Insert extends AppCompatActivity {
    AutoCompleteTextView at;
    String[] Country_Names={"http://www.yahoo.com/","http://www.google.com/","http://www.gmail.com/","http://www.starsports.com/","http://www.youtube.com/"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert);
        at=(AutoCompleteTextView) findViewById(R.id.at);
        ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.select_dialog_item,Country_Names);
        at.setThreshold(1);//cahracters to enter to get suggestion
        at.setAdapter(adapter);
    }
    public void insert(View v)
    {
        String name=at.getText().toString();
        String type="INSERT";
        BackgroundWriter backgroundWorker=new BackgroundWriter(this);
        backgroundWorker.execute(type,name);
    }
}
