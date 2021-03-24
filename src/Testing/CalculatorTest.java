package Testing;

import Calc.Calculator;
import Calc.CalculatorVisitor;
import Operand.Operand;
import Operand.Operator;
import Operand.Token;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;


class CalculatorTest {
    //For testing calulator
    private Calculator calculator;
    private ArrayList<Token> tokens;

    @BeforeEach
    void setUp(){
        calculator = new CalculatorVisitor();
        tokens = new ArrayList<>();
    }


    //Test for addition


    //Test for subtraktion

    //Test for multi

    //Test division

    //Test flere operander

    //Test flere operators

    //Hvis listen er tom

    //Hvis vi har tid så synes jeg vi skal lave en for eks multiplikation med, gange, minus what ever og flere operators






}
