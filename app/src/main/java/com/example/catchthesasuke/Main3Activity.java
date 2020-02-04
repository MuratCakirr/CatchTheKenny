package com.example.catchthesasuke;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {
    long level;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
    public void hard(View view){
        level = 250;
        Intent intent = new Intent(Main3Activity.this,MainActivity.class);
        intent.putExtra("score",3);
        intent.putExtra("level",level);
        startActivity(intent);
    }
    public void normal(View view){
        level = 500;
        Intent intent = new Intent(Main3Activity.this,MainActivity.class);
        intent.putExtra("score",2);
        intent.putExtra("level",level);
        startActivity(intent);
    }
    public void easy(View view){
        level = 750;
        Intent intent = new Intent(Main3Activity.this,MainActivity.class);
        intent.putExtra("score",1);
        intent.putExtra("level",level);
        startActivity(intent);
    }
}
