package com.example.studentapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class DashboardActivity extends AppCompatActivity {
AppCompatButton b1,b2,b3,b4,b5;
SharedPreferences mypreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        mypreferences=getSharedPreferences("login",MODE_PRIVATE);
        b1=(AppCompatButton) findViewById(R.id.addcourse);
        b2=(AppCompatButton) findViewById(R.id.addfaculty);
        b3=(AppCompatButton) findViewById(R.id.addexam);
        b4=(AppCompatButton) findViewById(R.id.viewweb);
        b5=(AppCompatButton) findViewById(R.id.logout);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(getApplicationContext(),CourseActivity.class);
                startActivity(a);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b=new Intent(getApplicationContext(),FacultyActivity.class);
                startActivity(b);

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c=new Intent(getApplicationContext(),ExamActivity.class);
                startActivity(c);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent d=new Intent(getApplicationContext(),WebActivity.class);
                startActivity(d);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor myedit=mypreferences.edit();
                myedit.clear();
                myedit.commit();
                Toast.makeText(getApplicationContext(), "Logout successfully", Toast.LENGTH_SHORT).show();
                Intent r=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(r);
            }
        });
    }
}