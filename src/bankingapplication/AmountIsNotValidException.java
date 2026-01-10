package bankingapplication;

public class AmountIsNotValidException extends RuntimeException {
    public AmountIsNotValidException(String message){
        super(message);
    }
}
