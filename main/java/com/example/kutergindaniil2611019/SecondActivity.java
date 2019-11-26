package com.example.kutergindaniil2611019;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
TextView tvname,tvage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tvname = (TextView)findViewById(R.id.tvname);
        tvage = (TextView)findViewById(R.id.tvage);

        String[] string = getIntent().getStringExtra("pers").split(" ");
        tvname.setText(string[0]);
        tvage.setText(string[1] + " ID " + string[2]);
    }

    public void MyOnClickAdd(View view) {
        Intent intent = new Intent(SecondActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
