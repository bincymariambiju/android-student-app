package com.example.studentapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class CourseActivity extends AppCompatActivity {
 EditText ed1,ed2,ed3,ed4;
 AppCompatButton b1,b2;
 String getCourseName,getDescription,getDuration,getRemarks;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);
        ed1=(EditText) findViewById(R.id.coursename);
        ed2=(EditText) findViewById(R.id.description);
        ed3=(EditText) findViewById(R.id.duration);
        ed4=(EditText) findViewById(R.id.remarks);
        b1=(AppCompatButton) findViewById(R.id.submitbtn);
        b2=(AppCompatButton) findViewById(R.id.btd);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getCourseName=ed1.getText().toString();
                getDescription=ed2.getText().toString();
                getDuration=ed3.getText().toString();
                getRemarks=ed4.getText().toString();
                Toast.makeText(getApplicationContext(),getCourseName,Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),getDescription,Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),getDuration,Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),getRemarks,Toast.LENGTH_LONG).show();
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