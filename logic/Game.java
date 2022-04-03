package logic;

import java.util.ArrayList;

import data.GameData;

public class Game {
    GameData gamedata = new GameData();
    ArrayList<String> gebaeudeListStrings = new ArrayList<String>();
    ArrayList<Object> gebaeudeList = new ArrayList<Object>();

    int size;
    String gebaeude;
    int i;
   
    public Game(){ 
        this.gebaeudeListStrings = gamedata.getArrayList();
        System.out.println(gebaeudeListStrings);
        for (Object element: gebaeudeListStrings){
            if(element.equals("mauer")){
                gebaeudeList.add(new mauer(gamedata));        
            }
            else if (element.equals("steingrube")){
                gebaeudeList.add(new steingrube(gamedata));
            }
            else if (element.equals("goldmine")){
                gebaeudeList.add(new goldmine(gamedata));
            }
        }
    }
    
    public ArrayList<Object> getGebaeudeList(){
        return this.gebaeudeList;
    }
    public ArrayList<String> getGebaeudeListStrings(){
        return this.gebaeudeListStrings;
    }
    public int getGebaeudeLength() {
        return gebaeudeList.size()-1;
    }


        // erhöhe totalen Wert
    public void increaseTotal_steinmenge(){
        gamedata.setTotal_steinmenge(gamedata.getTotal_steinmenge() + 1);
    }
    public int getTotal_Steinmenge(){
        return gamedata.getTotal_steinmenge();
    }
       
    public void increaseTotal_verteidigung(){
        gamedata.setTotal_verteidigung(gamedata.getTotal_verteidigung() + 1);
    }
       
    public void increaseTotal_reichtum(){
        gamedata.setTotal_reichtum(gamedata.getTotal_reichtum() + 1);
    }
    public int getTotal_Reichtum(){
        return gamedata.getTotal_reichtum();
    }
    
    // minimiere Wert des Totals
    public void decreaseTotal_steinmenge(){
        gamedata.setTotal_steinmenge(gamedata.getTotal_steinmenge() - 1);
    }
       
    public void decreaseTotal_verteidigung(){
        gamedata.setTotal_verteidigung(gamedata.getTotal_verteidigung() - 1);
    }
    public int getTotal_Verteidigung(){
        return gamedata.getTotal_verteidigung();
    }
       
    public void decreaseTotal_reichtum(){
        gamedata.setTotal_reichtum(gamedata.getTotal_reichtum() - 1);
    }

    // get total
    public int getTotal(){
        return gamedata.getTotal_reichtum() + gamedata.getTotal_verteidigung() + gamedata.getTotal_steinmenge();
    }
}