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
    
    public Adherent getAdherentById(int id) {
         for (Adherent a : adherents) {
            if (id == adherent.getId()){
                return a;
            }
        }
        
         return null;
    }
  
    
    public String onCreate() {
        return "validate";
    }
    
    public String onSave() {
        adherent.setId(adherents.size());
        adherents.add(adherent);
        adherent = new Adherent();
        return "listeAdherents";
    }
    
    public void onDelete(int id) {
        Adherent toDelete = getAdherentById(id);
        
        if (toDelete != null) {
            adherents.remove(toDelete);
        }
    }
    
    public String onSelect(int id) {
        adherent = getAdherentById(id);       
        return "update";
    }
    
    public String onUpdate() {
        return "listeAdherents";
    }
}
