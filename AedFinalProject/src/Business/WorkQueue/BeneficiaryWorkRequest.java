/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Event.EventDirectory;
import Business.Organization.Organization.RequestType;
import java.util.Date;

/**
 *
 * @author Administrator
 */
public class BeneficiaryWorkRequest extends WorkRequest{
    private int numberOfVolunteersRequest;
    private String senderOrganization;
    private  Date eventDate;
    private boolean add;
    private String eventName;
    private RequestType requestType;
    private EventDirectory eventDirectory;
    private String email;
    public BeneficiaryWorkRequest(){
        add = false;
        eventDirectory=new EventDirectory();
          
    }

    public Date getEventDate() {
        return eventDate;
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public void setRequestType(RequestType requestType) {
        this.requestType = requestType;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getSenderOrganization() {
        return senderOrganization;
    }

    public void setSenderOrganization(String senderOrganization) {
        this.senderOrganization = senderOrganization;
    }

    public EventDirectory getEventDirectory() {
        return eventDirectory;
    }

    public void setEventDirectory(EventDirectory eventDirectory) {
        this.eventDirectory = eventDirectory;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }




    
   
    public int getNumberOfVolunteersRequest() {
        return numberOfVolunteersRequest;
    }

    public void setNumberOfVolunteersRequest(int numberOfVolunteersRequest) {
        this.numberOfVolunteersRequest = numberOfVolunteersRequest;
    }
    public boolean isAdd() {
        return add;
    }

    public void setAdd(boolean add) {
        this.add = add;
    }

   
}
