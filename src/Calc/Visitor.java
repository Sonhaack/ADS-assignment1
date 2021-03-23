package Calc;

import Operand.Operand;
import Operand.Operator;

public interface Visitor {
    public void visit(Operand operand);
    public void visit(Operator operator);
}
