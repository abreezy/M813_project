/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tma02;

/**
 *
 * @author Abeer Shahid
 */
public class Employee extends User {
    // Attributes
    protected String password ;

    public Employee(String password, String name, String workEmail, String jobRole) {
        super(name, workEmail, jobRole);
        this.password = password;
    }
    
}
