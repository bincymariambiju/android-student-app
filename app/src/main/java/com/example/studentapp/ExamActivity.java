package com.example.studentapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ExamActivity extends AppCompatActivity {
    EditText ed1,ed2,ed3,ed4;
    AppCompatButton b1,b2;
    String getSemster,getExamName,getExamDate,getRemarks;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam);
        ed1=(EditText) findViewById(R.id.sem);
        ed2=(EditText) findViewById(R.id.ename);
        ed3=(EditText) findViewById(R.id.edate);
        ed4=(EditText) findViewById(R.id.remarks);
        b1=(AppCompatButton) findViewById(R.id.esubmit);
        b2=(AppCompatButton) findViewById(R.id.ebtd);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSemster=ed1.getText().toString();
                getExamName=ed2.getText().toString();
                getExamDate=ed3.getText().toString();
                getRemarks=ed4.getText().toString();
                Toast.makeText(getApplicationContext(),getSemster,Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),getExamName,Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),getExamDate,Toast.LENGTH_LONG).show();
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