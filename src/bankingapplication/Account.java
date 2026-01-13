package bankingapplication;

public class Account {
    double accountBalance = 0;
    private final String accountNumber;
    public Account(String phoneNumber){
        this.accountNumber = phoneNumber.substring(1);
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public double getAccountBalance(){
        return accountBalance;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public void credit(double amount){
        if(amount <= 0){
            throw new IllegalArgumentException("invalid amount");
        }else{
            setAccountBalance(getAccountBalance()+amount);
        }
    }

    public void debit(double amount){
        if(getAccountBalance()<amount){
            throw new InsufficientFundException("you do not have such money in your account");
        }else{
            setAccountBalance(getAccountBalance()-amount);
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountBalance=" + accountBalance +
                ", accountNumber='" + accountNumber + '\'' +
                '}';
    }
}
