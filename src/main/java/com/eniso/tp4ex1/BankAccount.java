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
public class BankAccount {
    protected Integer accountNumber;
    protected Double balance;
    
    public void deposit(double montant){
    this.balance= this.balance + montant;
    }
    
    public void withdraw (double montant){
    this.balance= this.balance - montant;
    }
    
    public Double getBalance(){
    return this.balance;
    }
    
}
