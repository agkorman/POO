package Guias.Guia4.EJ6_Expressions;


public class OrExpression extends BinaryExpression {

    public OrExpression(Expression leftExpression, Expression rightExpression) {
        super(leftExpression, rightExpression);
    }

    @Override
    public boolean evaluate() {
        return leftExpression.evaluate() || rightExpression.evaluate();
    }

}
