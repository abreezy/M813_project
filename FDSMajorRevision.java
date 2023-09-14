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
public class FDSMajorRevision {
    // Attributes
    String docName;
    Double revision;
    String author;
    Edit editor;
    LockStatus lockStatus;
    Date date;
    ApprovalStatus approvalStatus;
    
    // Associations
    FDSMinorRevision fdsMinorRevision;
    Approver aisLead, csvLead, qaLead;
    
    // Constructor
    // creates the FDSMajorRevision and links the minor revision instance
    public FDSMajorRevision(String docName, Edit editor, Double revision, String author, LockStatus lockStatus, Date date, FDSMinorRevision fdsMinorRevision) {
        this.docName = docName;
        this.revision = revision;
        this.author = author;
        this.date = date;
        this.lockStatus = lockStatus;
        this.editor = editor;
        this.fdsMinorRevision = fdsMinorRevision;
    }
    
}
