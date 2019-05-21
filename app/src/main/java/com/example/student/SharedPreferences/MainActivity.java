package com.example.student.SharedPreferences;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void writeclick(View view) {
        SharedPreferences sp=getSharedPreferences("test",MODE_PRIVATE);
        SharedPreferences.Editor ed=sp.edit();
        ed.putString("mytestkey","123");
        ed.commit();
    }


    public void readclick(View view) {
        SharedPreferences sp=getSharedPreferences("test",MODE_PRIVATE);
        String str=sp.getString("mytestkey","no data");
        Toast.makeText(this,str,Toast.LENGTH_SHORT).show();
    }
}
