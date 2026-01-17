package bankingapplication;

import java.util.Map;
import java.util.Objects;

public class User {
   private String surName;
   private String firstName;
   private String userName;
   private String phoneNumber;
   private Account account;

   public User(String firstName,String surName,String userName,String phoneNumber,Account account){
       this.surName = surName;
       this.firstName = firstName;
       this.phoneNumber = phoneNumber;
       this.userName = userName;
       this.account = account;
   }

   public String getsurName(){
       return surName;
   }

   public String getFirstName(){
       return firstName;
   }

   public String accountNumber(){
       return account.getAccountNumber();
   }
    public void withdraw(double amount){
       this.account.debit(amount);
    }

    public void deposit(double amount){
        this.account.credit(amount);
    }

    public double balance(){
       return this.account.getAccountBalance();
    }

}
