import bankingapplication.Account;
import bankingapplication.InvalidUserNameException;
import bankingapplication.User;

public static void main(String[] args) {
    User user = new User();

    Scanner sc = new Scanner(System.in);

    System.out.println("enter phone number");

    long phoneNum = sc.nextLong();

    user.createAccount(new Account("Samuel Benjamin",phoneNum));

    System.out.println("enter your phone number");

    long phoneNum2 = sc.nextLong();

    sc.close();

    user.createAccount(new Account("Idoko favour",phoneNum2));

        user.depositMoney("Idoko favour",400);
        System.out.println("the user does not exist");


        user.withdrawMoney("Samuel Benjamin",200);



        System.out.println(user.accountBalance("bryan favour"));

//    System.out.println(user.viewAccount());
}
