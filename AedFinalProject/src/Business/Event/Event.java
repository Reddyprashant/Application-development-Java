/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Event;

import java.util.Date;

/**
 *
 * @author prashantreddy
 */
public class Event {
    private String eventName;
    private int availVolunteers;
    private Date eventDate;
    private int requiredVolunteers;

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public int getAvailVolunteers() {
        return availVolunteers;
    }

    public void setAvailVolunteers(int availVolunteers) {
        this.availVolunteers = availVolunteers;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public int getRequiredVolunteers() {
        return requiredVolunteers;
    }

    public void setRequiredVolunteers(int requiredVolunteers) {
        this.requiredVolunteers = requiredVolunteers;
    }
    
}
