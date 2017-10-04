package com.example.kishorebaktha.assignment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }
    public void insert(View v) {
        Intent intent=new Intent(this,Insert.class);
        startActivity(intent);
    }
    public void view(View v) {
        String type = "VIEW";
        BackgroundWriter backgroundWorker = new BackgroundWriter(this);
         backgroundWorker.execute(type);
    }
    public void delete(View v) {
        Intent intent=new Intent(this,Delete.class);
        startActivity(intent);
    }
    public void update(View v) {
        Intent intent = new Intent(this, Update.class);
        startActivity(intent);
    }
}
