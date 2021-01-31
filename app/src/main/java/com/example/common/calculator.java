package com.example.common;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class calculator extends AppCompatActivity {
    EditText edt1, edt2, edt3;
    Button btnadd, btn2, btnmul, btnsub, btndiv, btnModulus, ce;
    float no1, no2;
    String a;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        edt1 = (EditText) findViewById(R.id.edt1);
        edt2 = (EditText) findViewById(R.id.more);
        edt3 = (EditText) findViewById(R.id.edt3);
        btnmul = (Button) findViewById(R.id.bntmul);
        btndiv = (Button) findViewById(R.id.bntdiv);
        btnsub = (Button) findViewById(R.id.bntsub);
        btnModulus = (Button) findViewById(R.id.bntmod);
        btn2 = (Button) findViewById(R.id.bnt2);
        ce = (Button) findViewById(R.id.bntCE);

        btnadd = (Button) findViewById(R.id.bntadd);

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                no1 = Float.parseFloat(edt1.getText().toString());
                no2 = Float.parseFloat(edt2.getText().toString());
                float add = no1 + no2;
                edt3.setText(String.valueOf(add));
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt2.setText("");
                edt1.setText("");
                a = edt3.getText().toString();
                edt1.setText(a);
            }
        });
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                no1 = Float.parseFloat(edt1.getText().toString());
                no2 = Float.parseFloat(edt2.getText().toString());
                float add = no1 * no2;
                edt3.setText(String.valueOf(add));
            }
        });
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                no1 = Float.parseFloat(edt1.getText().toString());
                no2 = Float.parseFloat(edt2.getText().toString());
                float add = no1 - no2;
                edt3.setText(String.valueOf(add));
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                no1 = Float.parseFloat(edt1.getText().toString());
                no2 = Float.parseFloat(edt2.getText().toString());
                float add = no1 / no2;
                edt3.setText(String.valueOf(add));
            }
        });
        btnModulus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                no1 = Float.parseFloat(edt1.getText().toString());
                no2 = Float.parseFloat(edt2.getText().toString());
                float add = no1 % no2;
                edt3.setText(String.valueOf(add));
            }
        });
        ce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt2.setText("");
                edt1.setText("");
                edt3.setText("");
            }
        });

    }
}