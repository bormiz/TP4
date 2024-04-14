/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp4;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author aziz
 */

@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Teacher extends User {
    private Long hIndex ;
    private List<Course> courses;

    @Override
    public void displayInfo() {
        super.displayInfo(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("hIndexe : " + hIndex);
        System.out.println("course : " + courses.toString());
        
    }

    @Override
    public void updateProfile(String firstname, String lastname, String email) {
        super.updateProfile(firstname, lastname, email); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        
    }

    @Override
    public boolean authenticate() {
        return super.authenticate(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    public void displayContent(){
        System.out.println(courses.toString());
    } 


    
}
