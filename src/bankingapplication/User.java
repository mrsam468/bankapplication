package bankingapplication;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class User {
    private static Map<String,Account> accountMemory = new HashMap<>();

//    createAccount
    public void createAccount(Account account){
        accountMemory.put(account.getUserName(),account);
    }
//    public void createAccounts(List<Account> account){
//
//    }


//    depositMoneyToAccount

    public void depositMoney(String userName,int amount) throws InvalidUserNameException{
       if(!accountMemory.containsKey(userName)){
           throw new InvalidUserNameException("the username you entered does not exist");
       }else{
           Account account =  accountMemory.get(userName);
           try {
               account.credit(amount);
           } catch (AmountIsNotValidException e) {
               e.getStackTrace();
           }
       }
    }


//    withdrawMoneyFromAccount

    public void withdrawMoney(String userName , int amount) throws InvalidUserNameException {
        if(!accountMemory.containsKey(userName)){
            throw new InvalidUserNameException("the name you have entered does not exist");
        }else{
            Account account = accountMemory.get(userName);
            try {
                account.debit(amount);
            } catch (InsufficientFundException e) {
                System.out.println("you do not have such money in your account");
            }
        }
    }

//    check account balance
    public int accountBalance(String userName) throws InvalidUserNameException {
        if(!accountMemory.containsKey(userName)){
            throw new InvalidUserNameException("account does not exist");
        }else {
            Account account = accountMemory.get(userName);
            return account.getAccountBalance();
        }
    }
    public Map<String, Account> viewAccount(){
        return accountMemory;
    }

}
