package com.example.myapplication;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn1).setOnClickListener(this);
        findViewById(R.id.btn2).setOnClickListener(this);
        findViewById(R.id.btn3).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int a,b,c;
        a = 1; b = 2; c = 3;
        int answer = 0;
        View textView = findViewById(R.id.formula);
        char result = setResult(1);
        textView.setText(result);
        if (v.getId() == R.id.btn1) {
            //ここにボタンを押した時に実行したい処理を記述する
            answer = a;
            Snackbar.make(v, "答えは" + answer + "です。", Snackbar.LENGTH_SHORT).show();

        } else if (v.getId() == R.id.btn2) {
            answer = a + b;
            Snackbar.make(v, "答えは" + answer + "です。", Snackbar.LENGTH_SHORT).show();

        } else if (v.getId() == R.id.btn3) {
            answer = a + b + c;
            Snackbar.make(v, "答えは" + answer + "です。", Snackbar.LENGTH_SHORT).show();
        }
    }

}


