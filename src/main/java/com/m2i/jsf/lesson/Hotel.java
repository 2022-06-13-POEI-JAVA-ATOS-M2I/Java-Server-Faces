package com.m2i.jsf.lesson;


public class Hotel {
    
    private int id;
    private String nom;
    private double latitude;
    private double longitude;
    private String adresse;
    private int star;

    public Hotel() {
    }

    public Hotel(String nom, double latitude, double longitude, String adresse, int star) {
        this.nom = nom;
        this.latitude = latitude;
        this.longitude = longitude;
        this.adresse = adresse;
        this.star = star;
    }
      
    public Hotel(int id, String nom, double latitude, double longitude, String adresse, int star) {
        this.id = id;
        this.nom = nom;
        this.latitude = latitude;
        this.longitude = longitude;
        this.adresse = adresse;
        this.star = star;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }    
}
