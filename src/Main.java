import bankingapplication.Account;
import bankingapplication.BankManager;
import bankingapplication.NewAccountInfo;
import bankingapplication.User;

public class Main{
    public static void main(String[] args){
        BankManager manager = new BankManager();
        NewAccountInfo samuel = manager.createUser("samuel", "benjamin", "bensam", "09163485259");
        NewAccountInfo edebo = manager.createUser("david","edebo","edebora","08107908359");
        manager.fundAccount(edebo.getAccountNumber(),100.00);
    }
}