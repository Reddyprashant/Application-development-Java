package Business.SignUp;

import Business.EcoSystem;
import Business.Role.Role;
import javax.swing.JPanel;
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
public class SignUpRequestIndividual extends SignUpRequest{

    private String location;
    private String gender;
    private String age;
    private String address;
    private String interest;
    private String occupation;
    
    public SignUpRequestIndividual(){
    super();
    }
    
    @Override
    public JPanel signUpForm(JPanel userProcessContainer, EcoSystem business) {
        return new SignUpJPanelIndividual(userProcessContainer,business);
    }

    @Override
    public String toString(){
    return SignUpRequest.SignUpType.Individual.getValue();
    }    
    
}
