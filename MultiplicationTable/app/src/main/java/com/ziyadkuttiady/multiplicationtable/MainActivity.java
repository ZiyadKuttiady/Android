package com.ziyadkuttiady.multiplicationtable;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText editText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.btnSubmit);
        editText = findViewById(R.id.num);
        textView = findViewById(R.id.result);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num = Integer.parseInt(editText.getText().toString());
                StringBuffer result = new StringBuffer();
                for (int i = 1; i <= 10; i++) {
                    result.append(i + " X " + num + " = " + (i * num) + "\n");
                }
                textView.setText(result);
            }
        });

    }
}
