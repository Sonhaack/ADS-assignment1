package Operations;

import Calc.CalculatorVisitor;

public abstract class Token {
    private CalculatorVisitor visitor;
    public abstract void accept(CalculatorVisitor visitor);
}
