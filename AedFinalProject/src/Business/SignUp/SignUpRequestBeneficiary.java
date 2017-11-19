package Business.SignUp;

import Business.EcoSystem;
import javax.swing.JPanel;
import userinterface.SignUp.SignUpJPanelBeneficiary;
import userinterface.SignUp.SignUpJPanelIndividual;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vinya
 */
public class SignUpRequestBeneficiary extends SignUpRequest{

   private String Country;
    private String State;
    private String address;
    
    public SignUpRequestBeneficiary(){
        super();
    }
 
    
    @Override
    public JPanel signUpForm(JPanel userProcessContainer, EcoSystem business) {
        return new SignUpJPanelBeneficiary(userProcessContainer,business);
    }
    
    @Override
    public String toString(){
    return SignUpRequest.SignUpType.Beneficiary.getValue();
    }
    
}
