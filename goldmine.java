public class goldmine implements gebaeude {
    public int goldmenge;
    public int produktionsgeschwindigkeit;
    public int steinmenge;
    public int goldmenge2;

    @Override
    public int getMaterial() {
        // TODO Auto-generated method stub
        return goldmenge;
    }

    @Override
    public int getProduktionsgeschwindigkeit() {
        // TODO Auto-generated method stub
        return produktionsgeschwindigkeit;
    }

    @Override
    public void payStein(int kosten) {
        // TODO Auto-generated method stub
        steinmenge = steinmenge - kosten;
    }
    
}
