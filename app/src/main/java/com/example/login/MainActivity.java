 package com.example.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   EditText name;
   EditText password;
   Button LOGIN;
   Button REGISTER;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         name=(EditText)findViewById(R.id.name);
         password=(EditText)findViewById(R.id.password);
         LOGIN= (Button)findViewById(R.id.button);
         REGISTER=(Button) findViewById(R.id.register);
        LOGIN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //  Toast.makeText(getApplicationContext(),"button is selected",Toast.LENGTH_LONG).show();
                validate(name.getText().toString(),password.getText().toString());
            }



        });
        REGISTER.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Toast.makeText(getApplicationContext(),"Register is selected",Toast.LENGTH_LONG).show();
                validate(name.getText().toString(),password.getText().toString());
                Intent intent = new Intent(MainActivity.this, Register.class);
                startActivity(intent);
            }
        });

    }

    private void validate(String name, String password) {
        if ((name.equals("admin")) && (password.equals("1234"))){
            Toast.makeText(getApplicationContext(),"button selected",Toast.LENGTH_LONG).show();



        } else if (!(!(name.equals("admin")) && !(password.equals("1234")))){
            Toast.makeText(getApplicationContext(),"button is not selected",Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(getApplicationContext(),"name or pasword is incorrect",Toast.LENGTH_LONG).show();
        }

    }

}
