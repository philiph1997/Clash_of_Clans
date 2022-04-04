package logic;

import data.GameData;
import data.gebaeude;

public class steingrube implements gebaeude {
    private int produktionsgeschwindigkeit;
    private GameData gamedata;

    public steingrube(GameData gamedata) {
        this.gamedata = gamedata;
        this.produktionsgeschwindigkeit = 1;
    }

    public void increaseTotal(){
        this.gamedata.setTotal_steinmenge(this.gamedata.getTotal_steinmenge() + this.produktionsgeschwindigkeit);
    }

    public int getTotal(){
        return this.gamedata.getTotal_steinmenge();
    }

    public void decreaseTotal(){
        this.gamedata.setTotal_steinmenge(this.gamedata.getTotal_steinmenge() - 1);
    }

    public void setProduktionsgeschwindigkeit(int level) {
        this.produktionsgeschwindigkeit = this.produktionsgeschwindigkeit + level;
    }
   
}