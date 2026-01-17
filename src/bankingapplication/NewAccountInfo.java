package bankingapplication;

public class NewAccountInfo {
    private String userName;
    private String accountNumber;

    public  NewAccountInfo(String userName,String accountNumber){
        this.userName = userName;
        this.accountNumber = accountNumber;
    }

    public String getUserName(){
        return userName;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

}
