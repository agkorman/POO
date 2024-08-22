package Taller.Taller3.e1;

public class DiscountRechargeableSubwayCard extends RechargeableSubwayCard{

    private double discountPercentage;

    public DiscountRechargeableSubwayCard(SubwayCentral sc, double dp) {
        super(sc);
        this.discountPercentage = dp;
    }

    @Override
    protected double rideCost() {
        return super.rideCost() * discountPercentage;
    }
}
