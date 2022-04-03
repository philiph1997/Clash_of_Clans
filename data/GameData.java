package data;

import java.util.ArrayList;

public class GameData {
    ArrayList<String> gebaeudeList = new ArrayList<String>();
//  Hier noch die Statistik-Daten rein

    public GameData(){
        gebaeudeList.add("Mauer");
        gebaeudeList.add("Steingrube");
        gebaeudeList.add("Goldmine");
        gebaeudeList.add("Goldmine");
        System.out.println("GameData:" + gebaeudeList);
    }

    public ArrayList getArrayList() {
        return this.gebaeudeList;
    }
    /*
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
