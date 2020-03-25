//14.	Fetch data from an EditText and display it in a TextView
package com.ziyadkuttiady.edittext_textview;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button disBtn;
    TextView textView;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        disBtn = findViewById(R.id.display);
        textView = findViewById(R.id.result);
        editText = findViewById(R.id.text);

        disBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(String.valueOf(editText.getText()));
            }
        });
    }
}
