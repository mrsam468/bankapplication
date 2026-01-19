package exeptions;

public class PhoneNumberAlreadyExistException extends RuntimeException{
    public PhoneNumberAlreadyExistException(String message){
        super(message);
    }
}
