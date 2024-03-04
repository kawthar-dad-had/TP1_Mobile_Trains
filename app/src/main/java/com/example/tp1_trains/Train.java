package com.example.tp1_trains;

public class Train {
    private String destination;
    private String departure;
    private String arrival;
    private String prix;

    // Ajoutez d'autres propriétés pour les autres détails du train

    public Train(String destination, String departure, String arrival , String prix) {
        this.destination = destination;
        this.departure = departure;
        this.arrival = arrival;
        this.prix = prix;
    }

    public String getDestination() {
        return destination;
    }

    // Setter pour la destination
    public void setDestination(String destination) {
        this.destination = destination;
    }

    // Getter pour l'heure de départ
    public String getDeparture() {
        return departure;
    }

    // Setter pour l'heure de départ
    public void setDeparture(String departure) {
        this.departure = departure;
    }

    // Getter pour l'heure d'arrivée
    public String getArrival() {
        return arrival;
    }

    // Setter pour l'heure d'arrivée
    public void setArrival(String arrival) {
        this.arrival = arrival;
    }
    public String getPrix() {
        return prix;
    }

    // Setter pour l'heure d'arrivée
    public void setPrix(String prix) {
        this.prix = prix;
    }
}
