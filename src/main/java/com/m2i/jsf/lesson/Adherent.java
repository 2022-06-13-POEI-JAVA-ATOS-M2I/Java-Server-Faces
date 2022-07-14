package com.m2i.jsf.lesson;

import java.io.Serializable;


public class Adherent implements Serializable {

    private String nom;
    private String prenom;
    private String dateNaissance;
    private String ville;
    private String loisir;
    private String sexe;

    public Adherent() {
        
    }
    
    public Adherent(String nom, String prenom, String dateNaissance, String ville, String loisir, String sexe) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.ville = ville;
        this.loisir = loisir;
        this.sexe = sexe;
    }

    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getLoisir() {
        return loisir;
    }

    public void setLoisir(String loisir) {
        this.loisir = loisir;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }
          
}
