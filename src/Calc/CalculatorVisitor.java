package Calc;
import Exceptions.MalformedExpressionException;
import List.LinkedStack;
import Operand.Operand;
import Operand.Operator;
import Operand.Token;

import java.util.Stack;

public class CalculatorVisitor implements Calculator, Visitor {

    //private Stack<Token> tokenStack;
    private LinkedStack<Token> linkedStack ;



    @Override
    public int getResult() throws MalformedExpressionException {

        try{
            linkedStack.pop();

        } catch (Exception e) {
            e.printStackTrace();
        }


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
