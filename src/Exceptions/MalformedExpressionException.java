package Exceptions;

public class MalformedExpressionException extends Exception {

    public MalformedExpressionException (){
        super("Please write expression correctly");
    }
}
