package tech.alexandluz.evotingsystem;

import android.app.AppComponentFactory;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class LogIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.log_in);
    }


    public void goBack (View v){
        Intent intent = new Intent(this, MainActivity.class);
        this.startActivity(intent);
    }

    public void signIn (View v){
        Intent intent = new Intent(this, FirstPage.class );
        this.startActivity(intent);
    }

}
