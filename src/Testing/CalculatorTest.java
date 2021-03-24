package Testing;
import Calc.Calculator;
import Calc.CalculatorVisitor;
import Calc.Client;
import Exceptions.MalformedExpressionException;
import Operations.Operation;
import Operations.Operator;
import Operations.Operand;
import Operations.Token;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;


class CalculatorTest {
    //For testing calulator
    private Calculator calculator;
    private ArrayList<Token> tokens;
    private Client client;

    @BeforeEach
    void setUp(){
        calculator = new CalculatorVisitor();
        tokens = new ArrayList<>();
        client = new Client();
    }

    @AfterEach
    void killAll(){
        tokens = null;
    }

    //Test for addition
    @Test
    void simpleAddition() {
        Operand operand1 = new Operand();
        Operand operand2 = new Operand();
        operand1.setValue(1);
        operand2.setValue(2);
        Operator operator = new Operator();
        operator.setOperation(Operation.ADDITION);

        tokens.add(operand1);
        tokens.add(operand2);
        tokens.add(operator);

        Assertions.assertEquals(operand1.getValue() + operand2.getValue(), client.evaluateExpression(tokens));
    }

    //Test for subtraktion
    @Test
    void simpleSubtraction() {
        Operand operand1 = new Operand();
        Operand operand2 = new Operand();
        operand1.setValue(10);
        operand2.setValue(2);
        Operator operator = new Operator();
        operator.setOperation(Operation.SUBTRACTION);

        tokens.add(operand1);
        tokens.add(operand2);
        tokens.add(operator);

        Assertions.assertEquals((operand1.getValue() - operand2.getValue()), client.evaluateExpression(tokens));
    }
    //Test for multi
    @Test
    void simpleMultiplication() {
        Operand operand1 = new Operand();
        Operand operand2 = new Operand();
        operand1.setValue(10);
        operand2.setValue(2);
        Operator operator = new Operator();
        operator.setOperation(Operation.MULTIPLICATION);

        tokens.add(operand1);
        tokens.add(operand2);
        tokens.add(operator);

        Assertions.assertEquals((operand1.getValue() * operand2.getValue()), client.evaluateExpression(tokens));
    }

    //Test division

    @Test
    void simpleDivision() {
        Operand operand1 = new Operand();
        Operand operand2 = new Operand();
        operand1.setValue(2);
        operand2.setValue(10);
        Operator operator = new Operator();
        operator.setOperation(Operation.DIVISION);

        tokens.add(operand1);
        tokens.add(operand2);
        tokens.add(operator);

        Assertions.assertEquals((operand1.getValue() / operand2.getValue()), client.evaluateExpression(tokens));
    }

    //Test flere operander

    //Test flere operators

    //Hvis listen er tom

    //Hvis vi har tid så synes jeg vi skal lave en for eks multiplikation med, gange, minus what ever og flere operators


    @Test
    void notSimpleCalculation(){
        Operand operand1 = new Operand();
        Operand operand2 = new Operand();
        Operand operand3 = new Operand();
        operand1.setValue(1);
        operand2.setValue(2);
        operand3.setValue(3);

        Operator operator1 = new Operator();
        operator1.setOperation(Operation.ADDITION);
        Operator operator2 = new Operator();
        operator2.setOperation(Operation.MULTIPLICATION);

        tokens.add(operand1);
        tokens.add(operand2);
        tokens.add(operand3);
        tokens.add(operator2);
        tokens.add(operator1);

        Assertions.assertEquals(7, client.evaluateExpression(tokens));
    }


// 1 2 3 * +

}
