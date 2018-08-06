package com.example.kalpeshsoni.practical2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2;
    Button b1;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = findViewById(R.id.num1);
        e2 = findViewById(R.id.num2);
        b1 = findViewById(R.id.add);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int a,b,c;
                a = Integer.parseInt(e1.getText().toString());
                b = Integer.parseInt(e2.getText().toString());

                c = a + b;

                Toast.makeText(getApplicationContext(),"Addition is:"+c,Toast.LENGTH_SHORT).show();

            }
        });
    }
}
