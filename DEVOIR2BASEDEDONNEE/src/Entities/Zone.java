package Entities;

import java.util.ArrayList;

public class Zone{
    private int id;
    private String nomzone; 
    ArrayList<Bien> listebiens= new ArrayList<>();
    public Zone() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNomzone() {
        return nomzone;
    }
    public void setNomzone(String nomzone) {
        this.nomzone = nomzone;
    }
    public ArrayList<Bien> getListebiens() {
        return listebiens;
    }
    public void setListebiens(ArrayList<Bien> listebiens) {
        this.listebiens = listebiens;
    }
}

