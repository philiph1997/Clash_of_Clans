package data;
public interface gebaeude {
    // den totalen Wert erhöhen
    public void increaseTotal();
    // Totalen Wert bekommen
    public int getTotal();
    // den totalen Wert minimieren
    public void decreaseTotal();
    // die Produktionsgeschwindigkeit setzen
    public void setProduktionsgeschwindigkeit(int level);
}