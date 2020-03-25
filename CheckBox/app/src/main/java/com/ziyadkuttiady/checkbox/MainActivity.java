package com.ziyadkuttiady.checkbox;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button showBtn;
    CheckBox java, php, js, c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showBtn = findViewById(R.id.show);
        java = findViewById(R.id.java);
        php = findViewById(R.id.php);
        js = findViewById(R.id.javascript);
        c = findViewById(R.id.c);

        showBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuffer result = new StringBuffer();
                result.append("JAVA Checked: ").append(java.isChecked());
                result.append("\nPHP Checked: ").append(php.isChecked());
                result.append("\nJavaScript Checked: ").append(js.isChecked());
                result.append("\nC Checked: ").append(c.isChecked());

                Toast.makeText(MainActivity.this, result, Toast.LENGTH_SHORT).show();
            }
        });

    }
}