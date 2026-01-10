package bankingapplication;

public class Account {
    private final String UserName;

    private int accountBalance =0;


    private long accountNumber;

    public Account(String UserName,long phoneNumber){
        this.UserName = UserName;
        String numberToBeConverted =Long.toString(phoneNumber);
        accountNumber = Long.parseLong(numberToBeConverted);
    }
//    setters
    private void setAccountBalance(int amount){
        accountBalance = amount;
    }

// getters

    public String getUserName() {
        return UserName;
    }

    public int getAccountBalance() {
        return accountBalance;
    }


    public long getAccountNumber() {
        return accountNumber;
    }
//    credit
    public void credit(int amount) throws AmountIsNotValidException {
        if(amount<=0){
            throw new AmountIsNotValidException("the amount is less than expected");
        }else {
            setAccountBalance(getAccountBalance() +amount);
        }

    }

//    debit
    public void debit(int amount) throws InsufficientFundException {
        if(accountBalance<amount){
            throw new InsufficientFundException("you do not have such money in your account");
        }else{
            setAccountBalance(getAccountBalance()-amount);
        }

    }

    @Override
    public String toString() {
        return "Account{" +
                "UserName='" + UserName + '\'' +
                ", accountBalance=" + accountBalance +
                ", accountNumber=" + accountNumber +
                '}';
    }
}
