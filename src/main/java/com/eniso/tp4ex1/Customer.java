/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp4ex1;

import java.util.ArrayList;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author aziz
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    private String firstName;
    private String lastName;
    private ArrayList<BankAccount>accounts;
    
    public void addAccount(BankAccount compte){
        accounts.add(compte);
    }
     public void removeAccount(BankAccount compte){
        for (int i=0 ; i< accounts.size(); i++){
            if (compte.equals(accounts.get(i))){
            accounts.remove(i);
            }
        }
    }
    public Double getTotalAccountBalance(){
        Double total=0.0;
        for (int i=0 ; i< accounts.size(); i++){
            total+=accounts.get(i).balance;
            }
        return total;
    }
    public void transferFunds(BankAccount sourceAccount, 
            BankAccount destinationAccount, Double amount){
    sourceAccount.balance= sourceAccount.balance- amount;
    destinationAccount.balance=destinationAccount.balance +amount;
    }
    
}
