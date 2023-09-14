/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tma02;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Abeer Shahid
 */
public class TicketCentre {
    // attributes

    // associations
    SupportTicket supportTicket;

    // Qualified associations
    Map<Integer, SupportTicket> tickets = new HashMap<>();
    // new tickets are stored in a hashmap along with their ticket numbers
    
    // methods
    SupportTicket raiseSupportTicket(Date date, Integer ticketNumber, TicketStatus status, Employee employee, Admin admin) throws TicketNumberAlreadyExistsException {
        // method body
        /*Invariant: true
        Precondition:
        -- specific support ticket doesn’t yet exist 
        */
        // if else loop added to throw exception if the current ticket number already exists
        SupportTicket ticket = new SupportTicket(date, ticketNumber, status, employee, admin);
        if (tickets.containsKey(ticket.ticketNumber)) {
            throw new TicketNumberAlreadyExistsException();
        } else {
        tickets.put(ticket.ticketNumber, ticket);
        // ticket with its ticket number added to tickets hashmap
        return ticket;
        }
        
        /* Postcondition:
        -- a new support ticket is created 
        -- with today’s date and the next number in the sequence
        -- and is linked to the user
        -- and the ticket status is set to open until it is taken ownership by an admin 
        */
    }
}
