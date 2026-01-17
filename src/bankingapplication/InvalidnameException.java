package bankingapplication;

public class InvalidnameException extends RuntimeException{
    public InvalidnameException(String message){
        super(message);
    }
}
