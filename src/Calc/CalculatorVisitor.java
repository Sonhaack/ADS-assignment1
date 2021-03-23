package Calc;
import Exceptions.MalformedExpressionException;

import java.util.Stack;

public class CalculatorVisitor implements Calculator, Visitor {

    private Stack<Token> tokenStack;

    public CalculatorVisitor() {
        this.tokenStack = new LinkedStack();
    }

    @Override
    public int getResult() throws MalformedExpressionException {
        return 0;
    }

    @Override
    public void visit(Operand operand) {

    }

    @Override
    public void visit(Operator operator) {

    }
}
