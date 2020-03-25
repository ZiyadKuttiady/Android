//2.	Addition of two Numbers (Write a program to add two numbers)
package com.ziyadkuttiady.addtwo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button myBtn;
    EditText firstNum, secondNum;
    TextView res;
    int num1, num2, sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myBtn = findViewById(R.id.addBtn);
        firstNum = findViewById(R.id.first);
        secondNum = findViewById(R.id.second);
        res = findViewById(R.id.result);

        myBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Integer.parseInt(firstNum.getText().toString());
                num2 = Integer.parseInt(secondNum.getText().toString());

                sum = num1 + num2;

                res.setText(String.valueOf(sum));
            }
        });
    }
}
