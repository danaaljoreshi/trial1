package com.example.multiactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView username=findViewById(R.id.username);
        Intent intent=getIntent();
        String name=intent.getStringExtra("Username");
        username.setText("Username: "+name);

        TextView password=findViewById(R.id.password);
        String pass=intent.getStringExtra("password");
        password.setText("Password: "+pass);

        TextView email=findViewById(R.id.Email);
        String mail=intent.getStringExtra("Email");
        email.setText("Email: "+mail);

    }
}
