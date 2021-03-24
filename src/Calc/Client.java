package Calc;

import Calc.CalculatorVisitor;
import Exceptions.MalformedExpressionException;
import Operand.Token;

import java.util.ArrayList;

public class Client {
    CalculatorVisitor calculatorVisitor = new CalculatorVisitor();

    public int evaluateExpression(ArrayList<Token> tokenList) {
        try {
            for (Token token : tokenList) {
                token.accept(calculatorVisitor);
            }
            return calculatorVisitor.getResult();
        } catch (MalformedExpressionException e) {
            System.out.println(e.getMessage());
        }
        return 0;

    }


}
