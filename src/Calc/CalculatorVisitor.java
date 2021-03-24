package Calc;

import Exceptions.MalformedExpressionException;
import List.LinkedStack;
import Operations.Operand;
import Operations.Operator;
import Operations.Token;

import java.util.EmptyStackException;

public class CalculatorVisitor implements Calculator, Visitor {

    private LinkedStack<Token> tokenStack;

    // private LinkedStack<Token> linkedStack ;


    public CalculatorVisitor() {
        tokenStack = new LinkedStack<Token>();
    }

    @Override
    public int getResult() throws MalformedExpressionException {
        Token token = null;
        try {
            token = tokenStack.pop();

        } catch (EmptyStackException e) {
            throw new MalformedExpressionException();
        }

        Operand operand = (Operand) token;
        return operand.getValue();
    }

    @Override
    public void visit(Operand operand) {
        pushOperand(operand);
    }

    @Override
    public void visit(Operator operator) {
        try {
            performOperation(operator);
        } catch (MalformedExpressionException e) {
            e.printStackTrace();
        }
    }

    private void pushOperand(Operand operand) {
        tokenStack.push(operand);
    }

    private void performOperation(Operator operator) throws MalformedExpressionException {
        //lav tokens og operands
        int result = 0;
        Token token1;
        Token token2;

        token1 = tokenStack.pop();
        token2 = tokenStack.pop();

        Operand operand1 = (Operand) token1;
        int opValue1 = operand1.getValue();

        Operand operand2 = (Operand) token2;
        int opValue2 = operand2.getValue();

// switch for at finde ud af hvilken operation vi skal have lavet
        switch (operator.getOperation()) {
            case ADDITION: {
                result =  opValue2 + opValue1 ;
                break;
            }
            case SUBTRACTION: {
                result = opValue2 - opValue1;
                break;
            }
            case DIVISION: {
                result = opValue2 / opValue1;
                break;
            }
            case MULTIPLICATION: {
                result = opValue2 * opValue1;
                break;
            }
        }
        Operand operand = new Operand();
        operand.setValue(result);
        pushOperand(operand);
    }
}
