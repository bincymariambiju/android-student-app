package com.example.studentapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class FacultyActivity extends AppCompatActivity {
    EditText ed1,ed2,ed3,ed4;
    AppCompatButton b1,b2;
    String getFacultyName,getDepartment,getDesignation,getMobileNo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty);
        ed1=(EditText) findViewById(R.id.fname);
        ed2=(EditText) findViewById(R.id.dept);
        ed3=(EditText) findViewById(R.id.designation);
        ed4=(EditText) findViewById(R.id.fmobile);
        b1=(AppCompatButton) findViewById(R.id.fsubmit);
        b2=(AppCompatButton) findViewById(R.id.fbtd);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFacultyName=ed1.getText().toString();
                getDepartment=ed2.getText().toString();
                getDesignation=ed3.getText().toString();
                getMobileNo=ed4.getText().toString();
                Toast.makeText(getApplicationContext(),getFacultyName,Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),getDepartment,Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),getDesignation,Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),getMobileNo,Toast.LENGTH_LONG).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent d=new Intent(getApplicationContext(),DashboardActivity.class);
                startActivity(d);
            }
        });
    }
}