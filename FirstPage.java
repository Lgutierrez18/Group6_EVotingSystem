package tech.alexandluz.evotingsystem;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class FirstPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_page);

    }

    public void goToPrimaries (View v){
        Intent intent = new Intent(this, Primaries.class);
        this.startActivity(intent);
    }

    public void goToPropositions (View v){
        Intent intent = new Intent(this, Propositions.class);
        this.startActivity(intent);
    }

    public void goToCandidates (View v){
        Intent intent = new Intent(this, Candidates.class);
        this.startActivity(intent);
    }

    public void goBacktoLogIn (View v){
        Intent intent = new Intent(this, LogIn.class);
        this.startActivity(intent);
    }


 }
