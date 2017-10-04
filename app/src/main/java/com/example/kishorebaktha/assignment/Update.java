package com.example.kishorebaktha.assignment;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;

public class Update extends AppCompatActivity {

    EditText t1;
    AutoCompleteTextView at;
    String[] Country_Names={"http://www.yahoo.com/","http://www.google.com/","http://www.gmail.com/","http://www.starsports.com/","http://www.youtube.com/"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);
        t1=(EditText)findViewById(R.id.sl);
        at=(AutoCompleteTextView) findViewById(R.id.at);
        ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.select_dialog_item,Country_Names);
        at.setThreshold(1);//cahracters to enter to get suggestion
        at.setAdapter(adapter);
    }
    public void update(View v)
    {
        String name=t1.getText().toString();
        String name2=at.getText().toString();
        String type="UPDATE";
        BackgroundWriter backgroundWorker=new BackgroundWriter(this);
        backgroundWorker.execute(type,name,name2);
    }
}
