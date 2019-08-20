package com.example.sendemail;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static android.support.design.widget.Snackbar.*;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    EditText editText2,editText3;
    FloatingActionButton fab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);
         editText2 = findViewById(R.id.editText2);
        editText3 = findViewById(R.id.editText3);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendMain();
            }
        });
    }


    private void sendMain()
    {
String mail = editText.getText().toString().trim();
String message = editText2.getText().toString();
String subject = editText3.getText().toString();

//send mail
        JavaMailAPI javamailapi = new JavaMailAPI(this,mail,subject,message);
        javamailapi.execute();

    }
}
