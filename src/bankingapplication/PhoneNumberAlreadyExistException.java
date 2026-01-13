package bankingapplication;

public class PhoneNumberAlreadyExistException extends RuntimeException{
    public PhoneNumberAlreadyExistException(String message){
        super(message);
    }
}
