/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tma02;

/**
 *
 * @author Abeer Shahid
 */
abstract class User {
    // Attributes
    protected String name;
    protected String workEmail;
    protected String jobRole;

    public User(String name, String workEmail, String jobRole) {
        this.name = name;
        this.workEmail = workEmail;
        this.jobRole = jobRole;
    }
}
