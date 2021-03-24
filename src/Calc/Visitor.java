package Calc;

import Operations.Operand;
import Operations.Operator;

public interface Visitor {
    public void visit(Operand operand);
    public void visit(Operator operator);
}
