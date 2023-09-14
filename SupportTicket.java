/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tma02;
import java.util.Date;
/**
 *
 * @author Abeer Shahid
 */
public class SupportTicket {
    // Attributes
    Date date;
    Integer ticketNumber;
    TicketStatus status;
    Employee employee;
    
    // Associations
    Admin admin;
    
    // Constructor

    SupportTicket(Date date, Integer ticketNumber, TicketStatus status, Employee employee, Admin admin) {
        /* Invariant: true
        Precondition: 
        -- specific support ticket doesn’t yet exist
        */
        this.date = new Date();
        this.ticketNumber = ticketNumber;
        this.status = TicketStatus.OPEN;
        this.employee = employee;
        this.admin = admin;
        /*
        Postcondition:
        -- a new SupportTicket instance is created
        -- with today’s date
        -- and is linked to the user
        -- and is given a new ticket identifier by the system 
        -- and is given status open 
        -- and is linked to admin
        */
    }
}
