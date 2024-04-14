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
public class StaffMember extends User{
    private String qualification;
private Integer experience ;
private List<String> tasks;

    @Override
    public void displayInfo() {
        super.displayInfo(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("qualification : " + qualification);
        System.out.println("experience : " + experience);
        System.out.println("tasks : " + tasks.toString());
    }

    @Override
    public boolean authenticate() {
        return super.authenticate(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    
    public void updateProfile(String firstname, String lastname, String email,
    String qualification,Integer experience,List<String> tasks) {
        super.updateProfile(firstname, lastname, email); 
        this.experience=experience;
        this.qualification= qualification;
        this.tasks=tasks;// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    public void finishTask(String task){
    for (int i=0;i<tasks.size();i++){
    if (task.equals(tasks.get(i))){
    tasks.remove(i);
    }
    }
    }

}
