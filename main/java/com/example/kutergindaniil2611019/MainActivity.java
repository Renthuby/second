package com.example.kutergindaniil2611019;

import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    EditText textname, textage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textage = (EditText) findViewById(R.id.textage);
        textname = (EditText) findViewById(R.id.textname);
    }

    public void MyOnClickAdd(View view) {
        String name = textname.getText().toString();
        int age = Integer.parseInt(textage.getText().toString());
        Toast.makeText(getApplicationContext(), name + " " + age, Toast.LENGTH_SHORT).show();
        Myperson person = new Myperson(name,age);

        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("pers", person.getName() + " " + person.getAge() + " " + person.ID);
        startActivity(intent);

    }
}
