/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp4;

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

public class User {
   private String firstName;
   private String lastName;
   private String email;
   private Long cin;
   public void displayInfo(){
       
       System.out.println("first name :" + firstName );
       System.out.println("last name :" + lastName );
       System.out.println("email :" + email );
       System.out.println("cin :" + cin );
   }
   public void updateProfile(String firstname,String lastname,String email){
       setFirstName(firstname);
       setLastName(lastname);
       setEmail(email);
       
       
   }
   public boolean authenticate(){
   return true;
   }
    
}
