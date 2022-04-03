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
        /*
        int count = 0;
        
        for (Object element: gebaeudeList){
            count = count + 1;
            System.out.println(count + ": " + element);
        }
        size = gebaeudeList.size()-1;
        System.out.println(size);
        for(int i = 0; i >= size-1; i++){
            Object gebaeudeObject = gebaeudeList.get(i);
            System.out.println(gebaeudeObject);
        }*/
    }
    
    public ArrayList getGebaeudeList(){
        return this.gebaeudeList;
    }
    public int getGebaeudeLength() {
        return gebaeudeList.size()-1;
    }
}