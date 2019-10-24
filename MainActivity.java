package tech.alexandluz.evotingsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToRegisterNow(View v) {
        Intent intent = new Intent (this,RegisterNow.class);
        this.startActivity(intent);
    }

    public void goToLogIn(View v) {
        Intent intent = new Intent (this, LogIn.class);
        this.startActivity(intent);
    }






}

