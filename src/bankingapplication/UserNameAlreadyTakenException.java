package bankingapplication;

public class UserNameAlreadyTakenException extends RuntimeException{
    public UserNameAlreadyTakenException(String message){
        super(message);
    }
}
