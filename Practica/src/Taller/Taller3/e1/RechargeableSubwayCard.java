package Taller.Taller3.e1;

public class RechargeableSubwayCard extends SubwayCard{
    private double balance;

    public RechargeableSubwayCard(SubwayCentral sc) {
        super(sc);
    }
    public void recharge(double amount){
        this.balance += amount;
    }
    protected double rideCost() {
        SubwayCentral sc = getSubwayCentral();
        return sc.getRideCost();
    }
    @Override
    protected boolean canRide() {
        return balance >= rideCost();
    }
    @Override
    public void ride() {
        if (canRide()) {
            this.balance -= rideCost();
        }
        else {
            System.out.println("Error: insuficient balance");
        }
    }
}
