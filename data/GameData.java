package data;

import java.util.ArrayList;

public class GameData {
    ArrayList<String> gebaeudeList = new ArrayList<String>();
 

    //  Hier noch die Statistik-Daten rein
    private int total_steinmenge;
    private int total_reichtum;
    private int total_verteidigung ;


    public GameData(){
        gebaeudeList.add("mauer");
        gebaeudeList.add("steingrube");
        gebaeudeList.add("goldmine");
        gebaeudeList.add("goldmine");
        System.out.println("GameData:" + gebaeudeList);

        total_steinmenge = 0;
        total_reichtum = 0;
        total_verteidigung = 0;
    }

    public ArrayList<String> getArrayList() {
        return this.gebaeudeList;
    }


    //=================================================================================================
    /* UNNÖTIG?
    public String getListObject(int index){
        String gebaeudeObject = gebaeudeList.get(index);  
        return gebaeudeObject;    
    }
    public void addGebaeude(String objectToAdd){
        gebaeudeList.add(objectToAdd);
    }
    public int getGebaeudeLength(){
        return gebaeudeList.size();
    }
    */


    public ArrayList<String> getGebaeudeList() {
        return gebaeudeList;
    }

    public void setGebaeudeList(ArrayList<String> gebaeudeList) {
        this.gebaeudeList = gebaeudeList;
    }

    public int getTotal_steinmenge() {
        return total_steinmenge;
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

    public int getTotal_verteidigung() {
        return total_verteidigung;
    }

    public void setTotal_verteidigung(int total_verteidigung) {
        this.total_verteidigung = total_verteidigung;
    }
}
