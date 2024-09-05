package Guias.Guia4.EJ6_Expressions;

public class NotExpression extends Expression{

    private Expression exp;

    public NotExpression(Expression exp) {
        this.exp = exp;
    }

    @Override
    public boolean evaluate() {
        return !exp.evaluate();
    }
}
