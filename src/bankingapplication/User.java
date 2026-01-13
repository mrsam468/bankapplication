package bankingapplication;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class User {
   private String surName;
    private String lastName;
    private String userName;
    private String phoneNumber;
    private static Map<String,Account> accountMap = new HashMap<>();

    public void createAccount(String surName,String lastName, String phoneNumber){

        if(phoneNumber.length() < 11){
            throw new InvalidPhoneNumberException("the number you are trying to enter is invalid ");
        }

        this.surName = surName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.userName = this.surName + " " + this.lastName;

        for(Account value : accountMap.values()){
            if(Objects.equals(value.getAccountNumber(), phoneNumber.substring(1))){
                throw new PhoneNumberAlreadyExistException("the number you are trying to use have already been taken");
            }
        }

        accountMap.put(this.userName,new Account(phoneNumber));
    }

    public void withdraw(String accountNumber,double amount){
        boolean conditionMet = false;
        for (Account accounts : accountMap.values()){

            if(Objects.equals(accounts.getAccountNumber(), accountNumber)){
                accounts.debit(amount);
                conditionMet = true;
            }

        }

        if (!conditionMet) {
            throw new NoAccountFoundException("you do not have an account");
        }
    }

    public void deposit(String accountNumber,double amount){
        boolean conditionMet = false;
        for (Account accounts : accountMap.values()){

            if(Objects.equals(accounts.getAccountNumber(), accountNumber)){
                accounts.credit(amount);
                conditionMet = true;
            }

        }

        if (!conditionMet) {
            throw new NoAccountFoundException("you do not have an account");
        }
    }

    public double balance(String accountNumber){
        for(Account account : accountMap.values()){
            if (Objects.equals(account.getAccountNumber(), accountNumber)){
                return account.getAccountBalance();
            }
        }
        return 0;
    }

    public Map<String,Account> viewAccount(){
        return accountMap;
    }
}
