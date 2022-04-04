package logic;

import data.GameData;
import data.gebaeude;

public class mauer implements gebaeude{
    private int produktionsgeschwindigkeit;
    private GameData gamedata;
    private Game game;

    public mauer(GameData gamedata) {
        this.gamedata = gamedata;
        this.produktionsgeschwindigkeit = 1;
    }

    public void decreaseTotal(){
       this.gamedata.setTotal_reichtum(this.gamedata.getTotal_reichtum() - 1);
    }

    public int getTotal(){
        return this.gamedata.getTotal_verteidigung();
    }

    public void increaseTotal(){
        this.gamedata.setTotal_verteidigung(this.
        gamedata.getTotal_verteidigung() + this.produktionsgeschwindigkeit);
    }

    public void setProduktionsgeschwindigkeit(int level) {
       this.produktionsgeschwindigkeit = this.produktionsgeschwindigkeit + level;
    }
}
