package data;

import java.util.ArrayList;


// alle Daten speichern
public class GameData {
    private ArrayList<String> gebaeudeList = new ArrayList<String>();

    private int total_steinmenge = 0;
    private int total_reichtum = 0;
    private int total_verteidigung = 0;


    public GameData(){
        gebaeudeList.add("mauer");
        gebaeudeList.add("steingrube");
        gebaeudeList.add("goldmine");
    }

    // Getters und Setters
    public ArrayList<String> getArrayList() {
        return this.gebaeudeList;
    }

    public int getTotal_steinmenge() {
        return total_steinmenge;
    }

    public int getTotal_verteidigung() {
        return total_verteidigung;
    }


    public ArrayList<String> getGebaeudeList() {
        return gebaeudeList;
    }

    public void setGebaeudeList(ArrayList<String> gebaeudeList) {
        this.gebaeudeList = gebaeudeList;
    }

    public void setTotal_steinmenge(int total_steinmenge) {
        this.total_steinmenge = total_steinmenge;
    }

    public int getTotal_reichtum() {
        return total_reichtum;
    }

    public void setTotal_reichtum(int total_reichtum) {
        this.total_reichtum = total_reichtum;
    }

    public void setTotal_verteidigung(int total_verteidigung) {
        this.total_verteidigung = total_verteidigung;
    }
}
