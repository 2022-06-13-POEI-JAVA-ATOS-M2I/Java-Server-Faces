package com.m2i.jsf.lesson;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean(name = "adherentData", eager = true)
@SessionScoped
public class AdherentData implements Serializable {

    private Adherent adherent;
    private List<Adherent> adherents;
           
    
    public AdherentData() {
        adherent = new Adherent();
        adherents = new ArrayList<>();
    }
    
    public AdherentData(Adherent adherent) {
        this.adherent = adherent;
    }

    public Adherent getAdherent() {
        return adherent;
    }

    public void setAdherent(Adherent adherent) {
        this.adherent = adherent;
    }

    public List<Adherent> getAdherents() {
        return adherents;
    }

    public void setAdherents(List<Adherent> adherents) {
        this.adherents = adherents;
    }
    
    public String onCreate() {
        return "validate";
    }
    
    public String onSave() {
        adherents.add(adherent);
        adherent = new Adherent();
        return "listeAdherents";
    }
    
}
