package logic;

import data.GameData;
import data.gebaeude;

public class mauer implements gebaeude{
    int steinmenge;
    int produktionsgeschwindigkeit;
    GameData gamedata;

    public mauer(GameData gamedata) {
        gamedata = this.gamedata;
        steinmenge = 0;
        produktionsgeschwindigkeit = 0;
    }
    /*
    @Override
    public int getMaterial() {
        // TODO Auto-generated method stub
        return steinmenge;
    }

    public void buildMauer() {
        steinmenge = steinmenge - getProduktionsgeschwindigkeit();
    }

    @Override
    public void payStein(int kosten){
        steinmenge = steinmenge - kosten;
    }

    @Override
    public int getProduktionsgeschwindigkeit() {
        // TODO Auto-generated method stub
        return produktionsgeschwindigkeit;
    }
    
    public void setProduktionsgeschwindigkeit(int level) {
        produktionsgeschwindigkeit = produktionsgeschwindigkeit + level;
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
