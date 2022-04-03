package logic;

import java.util.ArrayList;

import data.GameData;

public class Game {
    GameData gamedata = new GameData();
    ArrayList gebaeudeList = new ArrayList();
    int size;
    String gebaeude;
    int i;
   
    public Game(){ 
        this.gebaeudeList = gamedata.getArrayList();
        System.out.println(gebaeudeList);
        for (Object element: gebaeudeList){
            if(element == "Mauer"){
                gebaeudeList.add(new mauer(gamedata));        
            }
            else if (element == "Steingrube"){
                gebaeudeList.add(new steingrube(gamedata));
            }
            else if (element == "Goldmine"){
                gebaeudeList.add(new goldmine(gamedata));
            }
        }
    }
    
    public ArrayList getGebaeudeList(){
        return this.gebaeudeList;
    }
    public int getGebaeudeLength() {
        return gebaeudeList.size()-1;
    }


    public void subtractSteinmenge(int steine){
        gamedata.subtract_totalSteinmenge(steine);
    }
}