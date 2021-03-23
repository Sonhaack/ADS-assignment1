package Operand;

import Calc.CalculatorVisitor;

public class Operand extends Token {


    private int value;

    public int getValue() {
        return value;
    }

    @Override
    public void accept(CalculatorVisitor visitor) {
        visitor.visit(this);
    }
}
