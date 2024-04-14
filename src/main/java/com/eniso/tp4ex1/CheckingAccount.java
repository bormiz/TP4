/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp4ex1;

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
public class CheckingAccount extends BankAccount {
    private Double overdraftAllowed;
    
    public void setOverdraftAllowed(Double overdraftAllowed){
     this.overdraftAllowed = overdraftAllowed;
    }
    public void getOverdraftAllowed(){
        System.out.println(this.overdraftAllowed);
    }
    @Override
    public void withdraw (double montant){
    this.balance= this.balance - montant;
    }
}
