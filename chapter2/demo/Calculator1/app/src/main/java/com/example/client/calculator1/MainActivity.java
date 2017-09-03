package com.example.client.calculator1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btn;
    EditText tx1;
    EditText tx3;
    EditText tx5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        InitControls();
    }

    private void InitControls() {
        btn = (Button) findViewById(R.id.button);
        tx1 = (EditText) findViewById(R.id.editText1);
        tx3 = (EditText) findViewById(R.id.editText3);
        tx5 = (EditText) findViewById(R.id.editText5);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(tx1.getText().toString());
                int b = Integer.parseInt(tx3.getText().toString());

                tx5.setText(String.valueOf(a * b));
            }
        });
    }
}
