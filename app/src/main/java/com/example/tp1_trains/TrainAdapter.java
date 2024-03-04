package com.example.tp1_trains;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TrainAdapter extends RecyclerView.Adapter<TrainAdapter.TrainViewHolder> {

    private List<Train> trainList;

    public TrainAdapter(List<Train> trainList) {
        this.trainList = trainList;
    }

    @NonNull
    @Override
    public TrainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_train, parent, false);
        return new TrainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TrainViewHolder holder, int position) {
        Train train = trainList.get(position);
        holder.destinationTextView.setText(train.getDestination());
        holder.departureTextView.setText(train.getDeparture());
        holder.arrivalTextView.setText(train.getArrival());
        holder.prixTextView.setText(train.getPrix());
        // Liez d'autres détails du train aux vues correspondantes ici
    }

    @Override
    public int getItemCount() {
        return trainList.size();
    }

    public static class TrainViewHolder extends RecyclerView.ViewHolder {
        TextView destinationTextView;
        TextView departureTextView;
        TextView arrivalTextView;
        TextView prixTextView;

        public TrainViewHolder(View itemView) {
            super(itemView);
            destinationTextView = itemView.findViewById(R.id.destinationTextView);
            departureTextView = itemView.findViewById(R.id.departureTextView);
            arrivalTextView = itemView.findViewById(R.id.arrivalTextView);
            prixTextView = itemView.findViewById(R.id.prixTextView);
            // Initialisez d'autres vues pour les autres détails du train ici
        }
    }
}
