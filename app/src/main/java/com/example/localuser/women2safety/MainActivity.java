package com.example.localuser.women2safety;


import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private static int Time_Out=2000;
    public static String v1,v2,v3,v4,v5,v6,v7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boolean b = new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                v1 = HomeScreen.Name;
                v2 = HomeScreen.Phone;
                v4 = HomeScreen.Name1;
                v5 = HomeScreen.Phone1;
                v6 = HomeScreen.Name2;
                v7 = HomeScreen.Phone2;

                Intent homeIntent = new Intent(MainActivity.this, HomeScreen.class);
                Intent finalIntent = new Intent(MainActivity.this, AccountDetails.class);

                startActivity(homeIntent);
                finish();
            }
        }, Time_Out);
    }
}
