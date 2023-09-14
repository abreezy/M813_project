/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tma02;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Abeer Shahid
 */
public class FDSCentre {
    // attributes
    
    // associations
    FDSMajorRevision fdsMajorRevision;
    FDSMinorRevision fdsMinorRevision;
    
     // Qualified associations
    Map<FDSMajorRevision, List<FDSMinorRevision>> revisions = new HashMap<>();
    
    // methods
    // method for creation of FDS major revision instances 
    FDSMajorRevision createFDSMajorRevision(String docName, Edit editor, Double revision, String author, Date date, LockStatus lockStatus, FDSMinorRevision fdsMinorRevision) {
        FDSMajorRevision major = new FDSMajorRevision(docName, editor, revision, author, lockStatus, date, fdsMinorRevision);
        return major;
    }
    
    // method for creation of FDS minor revision instances
    FDSMinorRevision createFDSMinorRevision(FDSMajorRevision major, Approver aisLead, Approver csvLead, Approver qaLead, Edit editor) throws FDSMajorRevisionCurrentlyLockedException {
        //method body
        /*Invariant: true
        Precondition:
        -- the FDS major revision is not locked to another editor 
        */
        if (major.lockStatus == LockStatus.LOCKED && editor != major.editor) {
            throw new FDSMajorRevisionCurrentlyLockedException();
        }
        FDSMinorRevision minor = new FDSMinorRevision(major, aisLead, csvLead, qaLead);
        revisions.putIfAbsent(major, new ArrayList());
        revisions.get(major).add(minor);
        return minor;
        // the hashmap contains each major revision and its 1 or many minor revisions
    }
    
        /* -- a new FDS minor revision with a minor revision number based on its parent FDS is created 
        -- and the date of its creation is recorded
        -- and the name of the editor (known as author) is recorded and linked to the FDS
        -- and the approval status is set to not approved until approval process is initiated 
        -- and approvers aisLead, qaLead and csvLead are linked to the FDS
        */

    public List<FDSMinorRevision> getAllMinorRevisionsOfMajorRevision(FDSMajorRevision major) {
        return revisions.get(major);
        // this method returns the hashmap revisions for the major instance
        
    }
}
