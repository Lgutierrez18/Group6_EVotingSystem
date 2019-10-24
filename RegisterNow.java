package tech.alexandluz.evotingsystem;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterNow extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_now);
    }

    public void goBack (View v){
        Intent intent = new Intent(this, MainActivity.class);
        this.startActivity(intent);
    }
}
