package Business.SignUp;

import Business.EcoSystem;
import javax.swing.JPanel;
import userinterface.SignUp.SignUpJPanelEntity;
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
public class SignUpRequestEntity extends SignUpRequest{

private String organizationField;
private String Country;
private String State;

    public SignUpRequestEntity(){
    super();
    }
    
    @Override
    public JPanel signUpForm(JPanel userProcessContainer, EcoSystem business) {
        return new SignUpJPanelEntity(userProcessContainer,business);
    }
    
    @Override
    public String toString(){
    return SignUpRequest.SignUpType.Organization.getValue();
    }
    
}
