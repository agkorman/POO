package Guias.Guia4.EJ6_Expressions;

public abstract class Expression {

    public abstract boolean evaluate();

    Expression not() {
        return new NotExpression(this);
    }

    Expression and(Expression exp) {
        return new AndExpression(this, exp);
    }

    Expression or(Expression exp) {
        return new OrExpression(this, exp);
    }
}
