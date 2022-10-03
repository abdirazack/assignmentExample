package com.signal.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
    }

    public void showHome(View v){

        setContentView(R.layout.activity_main);
    }

    public void showLogin(View v){
        setContentView(R.layout.login);
    }

    public void showSignup(View v){
        setContentView(R.layout.signup);
    }

}