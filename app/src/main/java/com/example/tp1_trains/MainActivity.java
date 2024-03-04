package com.example.tp1_trains;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText villeDepart , villeArrivee;

    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        villeDepart = findViewById(R.id.villeTextD);
        villeArrivee = findViewById(R.id.villeTextA);

        Button btnValider = findViewById(R.id.btnValider);
        btnValider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Au clic sur le bouton "Valider", démarrez une nouvelle activité
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("villeDepart", villeDepart.getText().toString());
                intent.putExtra("villeArrivee", villeArrivee.getText().toString());
                startActivity(intent);
            }
        });

    }

}