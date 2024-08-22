package Taller.Taller3.e1;

public class FixedSubwayCard extends SubwayCard{
    private int rides;

    public FixedSubwayCard(SubwayCentral sc, int rides) {
        super(sc);
        this.rides = rides;
    }
    @Override
    protected boolean canRide() {
        return rides > 0;
    }
    @Override
    public void ride() {
        if (canRide()) {
            this.rides--;
        }
        else {
            System.out.println("Error: no rides left");
        }
    }
}
