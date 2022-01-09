package com.example.myapp1forws2022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editTextMyName;
    private Button buttonSayHello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextMyName = findViewById(R.id.editTextMyName);
        buttonSayHello = findViewById(R.id.buttonSayHello);

        buttonSayHello.setOnClickListener(buttonSayHelloClickListener);
    }

    View.OnClickListener buttonSayHelloClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String myName = editTextMyName.getText().toString();

            Toast.makeText(getApplicationContext(),"Привет "+myName, Toast.LENGTH_LONG).show();
        }
    };
}