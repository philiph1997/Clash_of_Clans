package logic;

import java.util.ArrayList;

import data.GameData;
public class Game {
    private GameData gamedata;
    private ArrayList<String> gebaeudeListStrings = new ArrayList<String>();
    private ArrayList<Object> gebaeudeList = new ArrayList<Object>();


   
    public Game(GameData gamedata, mauer mauer, steingrube steingrube, goldmine goldmine){ 
        this.gamedata = gamedata;
        this.gebaeudeListStrings = gamedata.getArrayList();

        // alle Gebäude einer Gebäudeliste hinzufügen
        gebaeudeList.add(mauer);
        gebaeudeList.add(steingrube);
        gebaeudeList.add(goldmine);

    }
    // getters
    public ArrayList<Object> getGebaeudeList(){
        return this.gebaeudeList;
    }
    public ArrayList<String> getGebaeudeListStrings(){
        return this.gebaeudeListStrings;
    }
    public int getGebaeudeLength() {
        return gebaeudeList.size()-1;
    }

    // get total
    public int getTotal(){
        return gamedata.getTotal_reichtum() + gamedata.getTotal_verteidigung() + gamedata.getTotal_steinmenge();
    }
}