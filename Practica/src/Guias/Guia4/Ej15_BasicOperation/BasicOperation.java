package Guias.Guia4.Ej15_BasicOperation;

public enum BasicOperation implements Operation{
    SUM("+", (x, y) -> x + y),
    SUBSTRACT("-", (x, y) -> x - y),
    MULTIPLY("*", (x, y) -> x * y),
    DEVIDE("/", (x, y) -> x / y);


    private String symbol;
    private Operation op;

    BasicOperation(String symbol, Operation op) {
        this.symbol = symbol;
        this.op = op;
    }

    @Override
    public double apply(double left, double right) {
        return op.apply(left, right);
    }

    @Override
    public String toString() {
        return "%s".formatted(symbol);
    }

}
