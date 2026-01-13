import bankingapplication.User;

public class Main{
    public static void main(String[] args){
        User user = new User();

        user.createAccount("Benjamin" , "Samuel","08107908359","Bensam");

        user.createAccount("Samuel","Favour","08107908358","Sam");

        user.deposit("8107908359",200);

        user.withdraw("8107908359",100);

        System.out.println(user.balance("8107908359"));

        System.out.println(user.viewAccount());
    }
}