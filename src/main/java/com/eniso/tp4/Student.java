/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp4;

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
public class Student extends User {
    private Double average;
    private classe classe;
    private status status;

    @Override
    public void displayInfo() {
        super.displayInfo(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("moyenne :" + average);
        System.out.println("class :" + classe);
        System.out.println("status :" + status);
    }

}
