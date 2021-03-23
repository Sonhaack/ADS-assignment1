package Operand;

public class Operand extends token {


    private int value;

    public void accept(CalculatorVisitor){}

    public int getValue(){return value}

}
