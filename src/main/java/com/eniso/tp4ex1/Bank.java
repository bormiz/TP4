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
public class Bank {
   private ArrayList<Customer> clients;
   
   public void addCustomer(Customer client){
    clients.add(client);
   }
   public void removeCustomer(Customer client){
   for (Customer Customer : clients){
       if (Customer.equals(Customer)){
       clients.remove(Customer);
       }
   
   }
   }
   
}
