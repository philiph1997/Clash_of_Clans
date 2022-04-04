package logic;

import data.GameData;
import data.gebaeude;

public class goldmine implements gebaeude {
    private int produktionsgeschwindigkeit;
    private GameData gamedata;
 
    
    public goldmine(GameData gamedata){
        this.gamedata = gamedata;
        this.produktionsgeschwindigkeit = 1;
    }
    
    // Wert des Totals erhöhen
    public void increaseTotal(){
        gamedata.setTotal_reichtum(gamedata.getTotal_reichtum() + produktionsgeschwindigkeit);          
    }

    // Total Wert zurückgeben
    public int getTotal(){
        return gamedata.getTotal_reichtum();
    }

    // Wert minimieren
    public void decreaseTotal(){
        gamedata.setTotal_reichtum(gamedata.getTotal_reichtum() - 1);
    }

    // Produktionsgeschwindigkeit erhöhen
    public void setProduktionsgeschwindigkeit(int level) {
        this.produktionsgeschwindigkeit = this.produktionsgeschwindigkeit + level;
    }
}
