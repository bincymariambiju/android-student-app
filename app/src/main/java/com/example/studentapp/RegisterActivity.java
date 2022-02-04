package com.example.studentapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    EditText ed1,ed2,ed3,ed4,ed5,ed6;
    AppCompatButton b1,b2;
    String getName,getRollno,getAdmission,getPassword,getUname,getCpass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ed1=(EditText) findViewById(R.id.name);
        ed2=(EditText) findViewById(R.id.rollno);
        ed3=(EditText) findViewById(R.id.admissionno);
        ed4=(EditText) findViewById(R.id.uname);
        ed5=(EditText) findViewById(R.id.pwd);
        ed6=(EditText) findViewById(R.id.cpass);
        b1=(AppCompatButton) findViewById(R.id.registerbtn);
        b2=(AppCompatButton) findViewById(R.id.loginbtn);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getName = ed1.getText().toString();
                getRollno = ed2.getText().toString();
                getAdmission = ed3.getText().toString();
                getUname = ed4.getText().toString();
                getPassword = ed5.getText().toString();
                getCpass = ed6.getText().toString();

                if (getPassword.equals(getCpass))
{


    Toast.makeText(getApplicationContext(), getName, Toast.LENGTH_LONG).show();
    Toast.makeText(getApplicationContext(), getRollno, Toast.LENGTH_LONG).show();
    Toast.makeText(getApplicationContext(), getAdmission, Toast.LENGTH_LONG).show();
    Toast.makeText(getApplicationContext(), getUname, Toast.LENGTH_LONG).show();
    Toast.makeText(getApplicationContext(), getPassword, Toast.LENGTH_LONG).show();
    Toast.makeText(getApplicationContext(), getCpass, Toast.LENGTH_LONG).show();

}
               else {
                    Toast.makeText(getApplicationContext(),"Password and confirm password does not match",Toast.LENGTH_LONG).show();
                }
            }
            });

    }
}