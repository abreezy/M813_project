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
public class FDSMinorRevision {
     // Attributes
    String docName;
    Double revision;
    String author;
    Edit editor;
    LockStatus lockStatus;
    Date date;
    ApprovalStatus approvalStatus;
    
    // Associations
    FDSMajorRevision fdsMajorRevision;
    Approver aisLead, csvLead, qaLead;
    
    // Constructor
    // creates the minor revision instance based off the linked major revision instance
    public FDSMinorRevision(FDSMajorRevision fdsMajorRevision, Approver aisLead, Approver csvLead, Approver qaLead) {
        this.fdsMajorRevision = fdsMajorRevision;
        // minor revision linked to fdsMajorRevision
        this.docName = fdsMajorRevision.docName;
        // docName inherited from the major revision
        this.fdsMajorRevision.lockStatus = LockStatus.LOCKED;
        // sets major revision to locked to ensure no one else can edit at the same time
        this.revision = fdsMajorRevision.revision + 0.1;
        // denotes the new FDSs minor revision 
        this.approvalStatus = ApprovalStatus.NOTAPPROVED;
        // approval status is set to not approved
        this.date = new Date();
        // today's date set for minor revision and approvers are linked
        this.aisLead = aisLead;
        this.csvLead = csvLead;
        this.qaLead = qaLead;
        
    }

    @Override
    public String toString() {
        return "FDSMinorRevision{" + "docName=" + docName + ", revision=" + revision + "}";
        // returns docName and revision as strings allowing these to be printed in the 3rd test case
    }
      
}
