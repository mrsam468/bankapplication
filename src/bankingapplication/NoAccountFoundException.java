package bankingapplication;

public class NoAccountFoundException extends RuntimeException{
    public NoAccountFoundException(String message){
        super(message);
    }
}
