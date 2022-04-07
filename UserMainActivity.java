package com.lawaware.lawawareapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class UserMainActivity extends AppCompatActivity {

    Button b1,b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usermain);

        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b3);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //user
                Intent i=new Intent(UserMainActivity.this,Userlogin.class);
                startActivity(i);



            }
        });



        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                //admin

                Intent i=new Intent(UserMainActivity.this,Setuserdetails.class);
                startActivity(i);

            }
        });






    }
}
