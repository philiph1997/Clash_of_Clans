package data;

import java.util.ArrayList;

public class GameData {
    ArrayList<String> gebaeudeList = new ArrayList<String>();
//  Hier noch die Statistik-Daten rein
    int total_steinmenge;
    int total_reichtum;
    int total_verteidigung ;
    int total_Total;


    public GameData(){
        gebaeudeList.add("Mauer");
        gebaeudeList.add("Steingrube");
        gebaeudeList.add("Goldmine");
        gebaeudeList.add("Goldmine");
        System.out.println("GameData:" + gebaeudeList);

        total_steinmenge = 0;
        total_reichtum = 0;
        total_verteidigung = 0;
        total_Total = 0;
    }

    public ArrayList getArrayList() {
        return this.gebaeudeList;
    }


    public void add_totalSteinmenge(int steine){
        total_steinmenge = total_steinmenge + steine;
    }
    public int get_totalSteinmenge(){
        return total_steinmenge;
    }
    public void subtract_totalSteinmenge(int steine){
        total_steinmenge = total_steinmenge - steine;
        System.out.println(total_steinmenge);
    }

    //=================================================================================================
    //Alles noch implemetnieren
    public void add_totalReichtum(){

    }

    public void add_totalVerteidigung(){

    }

    public void add_totalTotal(){

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
}
