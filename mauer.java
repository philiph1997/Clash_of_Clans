public class mauer implements gebaeude{
    int steinmenge;
    int produktionsgeschwindigkeit;

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

}
