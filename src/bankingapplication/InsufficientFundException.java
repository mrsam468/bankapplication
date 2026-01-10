package bankingapplication;

public class InsufficientFundException extends Exception{
    public InsufficientFundException(String message){
        super(message);
    }
}
