package bankingapplication;

public class AmountIsNotValidException extends Exception {
    public AmountIsNotValidException(String message){
        super(message);
    }
}
