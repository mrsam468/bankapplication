import bankingapplication.User;

public class Main{
    public static void main(String[] args){
        User user = new User();
        user.createAccount("Benjamin" , "Samuel","08107908359");
        user.createAccount("Idoko","favour","08107908358");
        user.deposit("8107908359",200);
        user.withdraw("8107908359",100);
        System.out.println(user.balance("8107908359"));
        System.out.println(user.viewAccount());
    }
}