package Operand;

import Calc.CalculatorVisitor;

public class Operator extends Token {

    private Operation operation;

    public Operator(Operation operation) {
        this.operation = operation;
    }

    public Operation getOperation() {
        return operation;
    }

    @Override
    public void accept(CalculatorVisitor visitor) {

    }
}
