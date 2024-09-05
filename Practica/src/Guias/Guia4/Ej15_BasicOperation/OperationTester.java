package Guias.Guia4.Ej15_BasicOperation;

public class OperationTester {

    public static void main(String[] args) {
        double x = 4;
        double y = 2;
        for(Operation operation : BasicOperation.values()) {
            System.out.printf("%.2f %s %.2f = %.2f\n", x, operation, y, operation.apply(x,y));
        }
        for(Operation operation : ExtendedOperation.values()) {
            System.out.printf("%.2f %s %.2f = %.2f\n", x, operation, y, operation.apply(x,y));
        }
    }
}

