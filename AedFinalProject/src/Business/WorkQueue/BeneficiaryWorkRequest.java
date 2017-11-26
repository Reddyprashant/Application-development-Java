/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.Date;

/**
 *
 * @author Administrator
 */
public class BeneficiaryWorkRequest extends WorkRequest{
    private int numberOfVolunteersRequest;
    private  Date date;
    private String message;
    private boolean add;
    
    public BeneficiaryWorkRequest(){
        add = false;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
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
