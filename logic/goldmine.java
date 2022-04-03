package logic;

import data.GameData;
import data.gebaeude;

public class goldmine implements gebaeude {
    public int gebaeudeGoldmenge = 0;
    public int gebaeudeProduktionsgeschwindigkeit = 1;
    GameData gamedata;
    //steinmenge aus GameData nehmen

    public goldmine(GameData gameData){
        gebaeudeGoldmenge = 0;
        gebaeudeProduktionsgeschwindigkeit = 1;
        gamedata = this.gamedata;
    }
    /*
    @Override
    public int getMaterial() {
        // TODO Auto-generated method stub
        return gebaeudeGoldmenge;
    }

    @Override
    public int getProduktionsgeschwindigkeit() {
        // TODO Auto-generated method stub
        return gebaeudeProduktionsgeschwindigkeit;
    }

    @Override
    public void payStein(int kosten) {
        // TODO Auto-generated method stub
        //steinmenge aus GameData holen
        //steinmenge = steinmenge - kosten;
    }
    */

    @Override
    public void setMaterial(int material) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public int getProduktionsgeschwindigkeit() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void payStein(int kosten) {
        // TODO Auto-generated method stub
        
    }
}
