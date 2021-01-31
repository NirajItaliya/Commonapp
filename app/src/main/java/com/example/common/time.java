package com.example.common;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

public class time extends AppCompatActivity {

    EditText eh, em/*,hh, mm*/;
    Button ok, b1, b2, b3, b4, b5, b6, b7, b8, b9, zero, ce;
    int n1, n2, n3, n4;
    String h2, m2, m1, h1;

    String aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);
       /* hh = (EditText) findViewById(R.id.hh);
        mm = (EditText) findViewById(R.id.mm);*/
        /*button0 = (Button) findViewById(R.id.zero);*/
        eh = (EditText) findViewById(R.id.eh);
        em = (EditText) findViewById(R.id.em);
        ok = (Button) findViewById(R.id.ok);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
        zero = (Button) findViewById(R.id.zero);
        ce = findViewById(R.id.ce);
        SimpleDateFormat sdf = new SimpleDateFormat("HH");
        h1 = sdf.format(new Date());
        n1 = Integer.parseInt(h1);
        /*  hh.setText(h1);*/

        SimpleDateFormat p = new SimpleDateFormat("mm");
        m1 = p.format(new Date());
        n3 = Integer.parseInt(m1);
        /*  mm.setText(m1);*/

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (eh.getText().toString().length() == 2) {
                    em.requestFocus();
                    em.setText(em.getText().toString() + "0");
                } else if (eh.getText().toString().length() < 2) {
                    eh.setText(eh.getText().toString() + "0");
                }

            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (eh.getText().toString().length() == 2) {
                    em.requestFocus();
                    em.setText(em.getText().toString() + "1");
                } else if (eh.getText().toString().length() < 2) {
                    eh.setText(eh.getText().toString() + "1");
                }

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (eh.getText().toString().length() == 2) {
                    em.requestFocus();
                    em.setText(em.getText().toString() + "2");
                } else if (eh.getText().toString().length() < 2) {
                    eh.setText(eh.getText().toString() + "2");
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (eh.getText().toString().length() == 2) {
                    em.requestFocus();
                    em.setText(em.getText().toString() + "3");
                } else if (eh.getText().toString().length() < 2) {
                    eh.setText(eh.getText().toString() + "3");
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (eh.getText().toString().length() == 2) {
                    em.requestFocus();
                    em.setText(em.getText().toString() + "4");
                } else if (eh.getText().toString().length() < 2) {
                    eh.setText(eh.getText().toString() + "4");
                }
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (eh.getText().toString().length() == 2) {
                    em.requestFocus();
                    em.setText(em.getText().toString() + "5");
                } else if (eh.getText().toString().length() < 2) {
                    eh.setText(eh.getText().toString() + "5");
                }
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (eh.getText().toString().length() == 2) {
                    em.requestFocus();
                    em.setText(em.getText().toString() + "6");
                } else if (eh.getText().toString().length() < 2) {
                    eh.setText(eh.getText().toString() + "6");
                }
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (eh.getText().toString().length() == 2) {
                    em.requestFocus();
                    em.setText(em.getText().toString() + "7");
                } else if (eh.getText().toString().length() < 2) {
                    eh.setText(eh.getText().toString() + "7");
                }
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (eh.getText().toString().length() == 2) {
                    em.requestFocus();
                    em.setText(em.getText().toString() + "8");
                } else if (eh.getText().toString().length() < 2) {
                    eh.setText(eh.getText().toString() + "8");
                }
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (eh.getText().toString().length() == 2) {
                    em.requestFocus();
                    em.setText(em.getText().toString() + "9");
                } else if (eh.getText().toString().length() < 2) {
                    eh.setText(eh.getText().toString() + "9");
                }
            }
        });
        ce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eh.setText("");
                em.setText("");
            }
        });

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                h2 = eh.getText().toString();
                m2 = em.getText().toString();
                n2 = Integer.parseInt(h2);
                n4 = Integer.parseInt(m2);
                if ((n1 == n2) & (n3 == n4)) {
                    startActivity(new Intent(time.this, next2.class));
                } else {
                    Toast.makeText(getApplicationContext(), "please enter the correct password", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}