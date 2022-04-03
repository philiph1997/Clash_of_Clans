package logic;

import data.GameData;
import data.gebaeude;

public class steingrube implements gebaeude {
    //public int steinmenge;
    public int produktionsgeschwindigkeit;
    GameData gamedata;

    public steingrube(GameData gamedata) {
        gamedata = this.gamedata;
        //steinmenge = 0;
        produktionsgeschwindigkeit = 1;
    }
    @Override
    public void setMaterial(int material) {
        // TODO Auto-generated method stub
        // gamedata.add_totalSteinmenge(material);
    }
    /*
    @Override
    //=================================================================================================
    //UNNÖTIG
    
    public int getMaterial() {
        // TODO Auto-generated method stub
        return steinmenge;
    }
    //=================================================================================================
    public void setMaterial(int material) {
        gamedata.add_totalSteinmenge(material);
        //UNNÖTIG
        //steinmenge = steinmenge + getProduktionsgeschwindigkeit();
    }

    public void payStein(int kosten){
        //steinmenge = steinmenge - kosten;
    } 
    */
    

    @Override
    public int getProduktionsgeschwindigkeit() {
        // TODO Auto-generated method stub
        produktionsgeschwindigkeit = 1; //später noch anpassen, dass sie angepasst wird
        return produktionsgeschwindigkeit;
    }
    public void setProduktionsgeschwindigkeit(int level) {
        produktionsgeschwindigkeit = produktionsgeschwindigkeit + level;
    }

    
    @Override
    public void payStein(int kosten) {
        // TODO Auto-generated method stub
        
    }
    
}