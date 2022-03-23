public class steingrube implements gebaeude {
    public int steinmenge;
    public int produktionsgeschwindigkeit;

    @Override
    public int getMaterial() {
        // TODO Auto-generated method stub
        return steinmenge;
    }
    public void setMaterial(int material) {
        steinmenge = steinmenge + getProduktionsgeschwindigkeit();
    }

    public void payStein(int kosten){
        steinmenge = steinmenge - kosten;
    } 

    @Override
    public int getProduktionsgeschwindigkeit() {
        // TODO Auto-generated method stub
        produktionsgeschwindigkeit = 1; //später noch anpassen, dass sie angepasst wird
        return produktionsgeschwindigkeit;
    }
    public void setProduktionsgeschwindigkeit(int level) {
        produktionsgeschwindigkeit = produktionsgeschwindigkeit + level;
    }
}