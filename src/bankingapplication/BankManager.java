package bankingapplication;


import javax.naming.InvalidNameException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BankManager {
    private Map<String,User> userStorage = new HashMap<>();
    private Map<String,String> accountInfo = new HashMap<>();

    public BankManager(){}

    public NewAccountInfo createUser(String firstName,String surName,String userName,String phoneNumber){
        Account account = createAccount(phoneNumber);
        User user = new User(firstName,surName,userName,phoneNumber,account);
        userStorage.put(userName,user);
        accountInfo.put(account.getAccountNumber(), userName);
        return new NewAccountInfo(userName,account.getAccountNumber());
    }

    public void fundAccount(String accountNumber,double amount){
        if (!accountInfo.containsKey(accountNumber)){
            throw new NoAccountFoundException("this account does not exist");
        }
        String userName = accountInfo.get(accountNumber);
        User user = userStorage.get(userName);
        user.deposit(amount);
    }

    public void withdrawFromAccount(String fullName,String accountNumber,double amount){
        String userName = accountInfo.get(accountNumber);
        User user  = userStorage.get(userName);
        if (Boolean.parseBoolean(user.getsurName() + " " + user.getFirstName().equals(fullName)) || Boolean.parseBoolean(user.getFirstName() + " " + user.getsurName().equals(fullName))){
            user.withdraw(amount);
        }else {
            throw new InvalidnameException("the name you have entered is invalid");
        }
    }

    public double accountBalance (String userName){
        User user =userStorage.get(userName);
        return user.balance();
    }
    private Account createAccount(String phoneNumber){
        if (phoneNumber.length() < 11){
            throw new InvalidPhoneNumberException("the length of the phone number is not complete");
        }

        Pattern pattern = Pattern.compile("//d//d//d//d//d//d//d//d//d//d//d");
        Matcher matcher = pattern.matcher(phoneNumber);
        boolean phoneNumberCorrect = matcher.find();
        if (!phoneNumberCorrect){
            throw new InvalidPhoneNumberException("this is an invalid phone number");
        }
        return new Account(phoneNumber);
    }



}
