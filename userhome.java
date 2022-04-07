package com.lawaware.lawawareapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class userhome extends AppCompatActivity {

    EditText e1,e2;
    Button b1,b2,b3;
   String empty="";

    String user,pass,case_info;
    int fg=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userhome);

        e1=(EditText)findViewById(R.id.edittext3);
        b1 = (Button)findViewById(R.id.button);

        b2 = (Button)findViewById(R.id.button4);






        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i=new Intent(userhome.this,searchlawlist.class);

                i.putExtra("search", e1.getText().toString());
                finish();
                startActivity(i);

            }
        });


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i=new Intent(userhome.this,Imagecapture.class);

               // i.putExtra("search", e1.getText().toString());
                finish();
                startActivity(i);

            }
        });








    }
}
