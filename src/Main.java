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

    try {
        user.depositMoney("Idoko favour",400);
    } catch (InvalidUserNameException e) {
        System.out.println("the user does not exist");
    }


    try {
        user.withdrawMoney("Samuel Benjamin",200);
    } catch (InvalidUserNameException e) {
        System.out.println("insufficient fund");
    }


    try {
        System.out.println(user.accountBalance("bryan favour"));
    } catch (InvalidUserNameException e) {
        System.out.println("invalid user name");
    }
    System.out.println(user.viewAccount());
}
