package com.example.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    EditText username;
    EditText pass;
    Button REGISTER;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        username=(EditText)findViewById(R.id.username);
        pass=(EditText)findViewById(R.id.pass);
        REGISTER=(Button)findViewById(R.id.btn);

        REGISTER.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

             validate(username.getText().toString(),pass.getText().toString());
            }
        });


    }

    private void validate(String username, String pass) {
        if ((username.equals("admin"))&&(pass.equals("1234")));
        Toast.makeText(getApplicationContext(),"Now registered",Toast.LENGTH_LONG).show();
        Intent intent= new Intent(Register.this,MainActivity.class);
        startActivity(intent);
    }

}
