package Guias.Guia4.Ej15_BasicOperation;

public enum ExtendedOperation implements Operation{

    POW("^", (x, y) -> Math.pow(x, y)),
    REMINDER("%", (x, y) -> x % y);

    private String symbol;
    private Operation op;

    ExtendedOperation(String symbol, Operation op) {
        this.symbol = symbol;
        this.op = op;
    }

    @Override
    public double apply(double right, double left) {
        return op.apply(right, left);
    }

    @Override
    public String toString() {
        return symbol;
    }
}
