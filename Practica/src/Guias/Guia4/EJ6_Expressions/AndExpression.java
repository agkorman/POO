package Guias.Guia4.EJ6_Expressions;


public class AndExpression extends BinaryExpression {

    public AndExpression(Expression leftExpression, Expression rightExpression) {
        super(leftExpression, rightExpression);
    }

    @Override
    public boolean evaluate() {
        return leftExpression.evaluate() && rightExpression.evaluate();
    }

}
