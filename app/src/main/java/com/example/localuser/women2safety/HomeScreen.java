package com.example.localuser.women2safety;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class HomeScreen extends AppCompatActivity {

    EditText ed1,ed2,ed3,ed4,ed5,ed6,ed7;
    Button b1;
    public static final String MyPREFERENCES = "MyPrefs" ;
    public static final String Name = "nameKey";
    public static final String Phone = "phoneKey";
    public static final String Email = "addKey";
    public static final String Name1 = "name1Key";
    public static final String Phone1 = "phone1Key";
    public static final String Name2 = "name2Key";
    public static final String Phone2 = "phone2Key";

    SharedPreferences sharedpreferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        ed1=(EditText)findViewById(R.id.name);
        ed2=(EditText)findViewById(R.id.phone);
        ed3=(EditText)findViewById(R.id.address);

        ed4=(EditText)findViewById(R.id.name1);
        ed5=(EditText)findViewById(R.id.phone1);
        ed6=(EditText)findViewById(R.id.name2);
        ed7=(EditText)findViewById(R.id.phone2);
        b1=(Button)findViewById(R.id.go);
        sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n  = ed1.getText().toString();
                String ph  = ed2.getText().toString();
                String a  = ed3.getText().toString();
                String n1  = ed1.getText().toString();
                String ph1  = ed2.getText().toString();
                String n2  = ed1.getText().toString();
                String ph2  = ed2.getText().toString();

                SharedPreferences.Editor editor = sharedpreferences.edit();

                editor.putString(Name, n);
                editor.putString(Phone, ph);
                editor.putString(Email, a);
                editor.putString(Name1, n1);
                editor.putString(Phone1, ph1);
                editor.putString(Name2, n2);
                editor.putString(Phone2, ph2);


                editor.commit();


                Toast.makeText(HomeScreen.this,"Welcome!",Toast.LENGTH_LONG).show();

                    Intent i = new Intent(HomeScreen.this,AccountDetails.class);
                    startActivity(i);

                }

        });
    }

}
