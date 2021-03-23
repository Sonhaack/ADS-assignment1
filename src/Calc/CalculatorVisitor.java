package Calc;
import Exceptions.MalformedExpressionException;
import Operand.Operand;
import Operand.Operator;
import Operand.Token;

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

    private void pushOperand(Operand operand){
        return;
    }

    private void performOperation(Operator operator) throws MalformedExpressionException {
        return;
    }
}
