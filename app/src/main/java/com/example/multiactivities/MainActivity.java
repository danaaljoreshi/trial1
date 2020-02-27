package com.example.multiactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText username=findViewById(R.id.username);
        final EditText password=findViewById(R.id.password);
        final EditText email=findViewById(R.id.Email);


        Button goToWelcome=(Button)findViewById(R.id.goToWelcome);

        goToWelcome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                boolean name=true,pass=true,mail=true;
                    if (username.getText().toString().length() == 0) {
                        name = false;
                        username.setError("Please enter Your Username");
                    }
                    else name=true;
                    if (password.getText().toString().length() == 0) {
                        pass=false;
                        password.setError("Please enter your password");
                    }
                    else
                if (Character.isLowerCase(password.getText().toString().charAt(0))) {
                    pass=false;
                    password.setError("your Password should start with CAPITAL letter");
                }
                else pass=true;
                    if (email.getText().toString().length() == 0) {
                        mail=false;
                        email.setError("Enter your email please");
                    }
                    else mail=true;


                    if(name&&pass&&mail)
                    {
                Intent intent= new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("Username",username.getText().toString());
                intent.putExtra("password",password.getText().toString());
                intent.putExtra("Email",email.getText().toString());
                startActivity(intent);
            }//end of if
            }//on click
        });

    }
}
