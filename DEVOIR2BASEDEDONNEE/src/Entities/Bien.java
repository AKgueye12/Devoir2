package Entities;

import java.util.Date;

public class Bien {
    private int id;
    private String reference;
    private String description;
    private float prix; 
    private Date datecreation;
    Zone zone;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getReference() {
        return reference;
    }
    public void setReference(String reference) {
        this.reference = reference;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public float getPrix() {
        return prix;
    }
    public void setPrix(float prix) {
        this.prix = prix;
    }
    public Date getDatecreation() {
        return datecreation;
    }
    public void setDatecreation(Date datecreation) {
        this.datecreation = datecreation;
    }
}
