package exeptions;

public class InsufficientFundException extends RuntimeException{
    public InsufficientFundException(String message){
        super(message);
    }
}
