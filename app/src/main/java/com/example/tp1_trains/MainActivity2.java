package com.example.tp1_trains;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {

    private RecyclerView recyclerView;
    private TrainAdapter adapter;
    private List<Train> trainList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        recyclerView = findViewById(R.id.recyclerView);
        trainList = generateTrainData(); // Méthode pour générer des données de train factices

        adapter = new TrainAdapter(trainList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private List<Train> generateTrainData() {

        Intent intent = getIntent();
        List<Train> trainList = new ArrayList<>();

        // Ajoutez des données factices pour les trains
        trainList.add(new Train(""+intent.getStringExtra("villeDepart")+"-"+intent.getStringExtra("villeArrivee"), "07:00", "10:30","20$"));
        trainList.add(new Train(""+intent.getStringExtra("villeDepart")+"-"+intent.getStringExtra("villeArrivee"), "08:30", "11:45","23$"));
        trainList.add(new Train(""+intent.getStringExtra("villeDepart")+"-"+intent.getStringExtra("villeArrivee"), "09:15", "12:00","21$"));
        trainList.add(new Train(""+intent.getStringExtra("villeDepart")+"-"+intent.getStringExtra("villeArrivee"), "10:00", "13:30","23$"));
        // Ajoutez d'autres trains de manière similaire

        return trainList;
    }
}