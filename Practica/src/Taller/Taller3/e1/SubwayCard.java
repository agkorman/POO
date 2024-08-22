package Taller.Taller3.e1;

public abstract class SubwayCard {

    private SubwayCentral subwayCentral;

    public SubwayCard(SubwayCentral sc) {
        this.subwayCentral = sc;
    }
    abstract protected boolean canRide();

    protected SubwayCentral getSubwayCentral() {
        return this.subwayCentral;
    }
    abstract public void ride();
}