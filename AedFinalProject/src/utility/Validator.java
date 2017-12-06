/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

import java.awt.event.KeyEvent;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.SendFailedException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

//import org.jsmpp.InvalidResponseException;
//import org.jsmpp.PDUException;
//import org.jsmpp.bean.Alphabet;
//import org.jsmpp.bean.BindType;
//import org.jsmpp.bean.ESMClass;
//import org.jsmpp.bean.GeneralDataCoding;
//import org.jsmpp.bean.MessageClass;
//import org.jsmpp.bean.NumberingPlanIndicator;
//import org.jsmpp.bean.RegisteredDelivery;
//import org.jsmpp.bean.SMSCDeliveryReceipt;
//import org.jsmpp.bean.TypeOfNumber;
//import org.jsmpp.extra.NegativeResponseException;
//import org.jsmpp.extra.ResponseTimeoutException;
//import org.jsmpp.session.BindParameter;
//import org.jsmpp.session.SMPPSession;
//import org.jsmpp.util.AbsoluteTimeFormatter;
//import org.jsmpp.util.TimeFormatter;
/**
 *
 * @author Administrator
 */
public class Validator {
   
     public static void onlyString(KeyEvent evt, JTextField field) {
          char c = evt.getKeyChar();
        if (!((c >= 'A') && (c <= 'Z') || (c >= 'a') && (c <= 'z') || (c==evt.VK_SPACE) || (c==evt.VK_CAPS_LOCK) || (c==evt.VK_SHIFT)||
            (c == evt.VK_BACK_SPACE) ||
            (c == evt.VK_DELETE))) {

        JOptionPane.showMessageDialog(null, "Enter Alphabets only");
       field.setText("");
        }
     }
     
     public static void onlyInteger(KeyEvent evt, JTextField field) {
          char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9')||
            (c == evt.VK_BACK_SPACE) ||
            (c == evt.VK_DELETE))) {

        JOptionPane.showMessageDialog(null, "Enter Integers only");
       field.setText("");
        }
     }
     
     public static void sendMessage(String emailId) throws SendFailedException{
           // Recipient's email ID needs to be mentioned.
      String to = emailId;

      // Sender's email ID needs to be mentioned
     // String from = "poojithshtt";
     // String pass = "passwordcodename";
      String from = "poojithsshetty";
      String pass = "Fall@2017";
      // Assuming you are sending email from localhost
     // String host = "192.168.0.16";

      // Get system properties
      Properties properties = System.getProperties();
       String host = "smtp.gmail.com";

    properties.put("mail.smtp.starttls.enable", "true");

    properties.put("mail.smtp.ssl.trust", host);
    properties.put("mail.smtp.user", from);
   // properties.put("mail.smtp.password", pass);
    properties.put("mail.smtp.port", "587");
    properties.put("mail.smtp.auth", "true");

      // Setup mail server
     // properties.setProperty("mail.smtp.host", host);
    //  properties.put("mail.smtp.starttls.enable", "true");
      // Get the default Session object.
      Session session = Session.getDefaultInstance(properties);

      try {
         // Create a default MimeMessage object.
         MimeMessage message = new MimeMessage(session);

         // Set From: header field of the header.
         message.setFrom(new InternetAddress(from));

         // Set To: header field of the header.
         message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

         // Set Subject: header field
         message.setSubject("Volunteer Management Account activation");
        //  message.setSubject("Sent me blank message???");

         // Now set the actual message
       //  message.setText("Your account is active. You can now to register yourself to clean 24 Saint Cyprians place.");
       // message.setText("Now I will start messaging");
        message.setText("Your Account has been Activated.");
         // Send message
           Transport transport = session.getTransport("smtp");
        transport.connect(host, from, pass);
        transport.sendMessage(message, message.getAllRecipients());
        transport.close();
         System.out.println("Sent message successfully....");
      } catch (MessagingException mex) {
         mex.printStackTrace();
      }
     }
     
//    private static TimeFormatter timeFormatter = new AbsoluteTimeFormatter();;
    
    public static void sendMessageText(String phone, String network) {
         try {
             //Validator.sendMessage("8573089754@tmomail.net");
             Validator.sendMessage("7743158427@tmomail.net");
           // Validator.sendMessage("vinyasktr@gmail.com");
//        SMPPSession session = new SMPPSession();
//        try {
//            session.connectAndBind("localhost", 8056, new BindParameter(BindType.BIND_TX, "test", "test", "cp", TypeOfNumber.UNKNOWN, NumberingPlanIndicator.UNKNOWN, null));
//        } catch (IOException e) {
//            System.err.println("Failed connect and bind to host");
//            e.printStackTrace();
//        }
//        
//        try {
//            String messageId = session.submitShortMessage("CMT", TypeOfNumber.INTERNATIONAL, NumberingPlanIndicator.UNKNOWN, "18573089756", TypeOfNumber.INTERNATIONAL, NumberingPlanIndicator.UNKNOWN, "18573089756", new ESMClass(), (byte)0, (byte)1,  timeFormatter.format(new Date()), null, new RegisteredDelivery(SMSCDeliveryReceipt.DEFAULT), (byte)0, new GeneralDataCoding(Alphabet.ALPHA_DEFAULT, MessageClass.CLASS1, false), (byte)0, "jSMPP simplify SMPP on Java platform".getBytes());
//            System.out.println("Message submitted, message_id is " + messageId);
//        } catch (PDUException e) {
//            // Invalid PDU parameter
//            System.err.println("Invalid PDU parameter");
//            e.printStackTrace();
//        } catch (ResponseTimeoutException e) {
//            // Response timeout
//            System.err.println("Response timeout");
//            e.printStackTrace();
//        } catch (InvalidResponseException e) {
//            // Invalid response
//            System.err.println("Receive invalid respose");
//            e.printStackTrace();
//        } catch (NegativeResponseException e) {
//            // Receiving negative response (non-zero command_status)
//            System.err.println("Receive negative response");
//            e.printStackTrace();
//        } catch (IOException e) {
//            System.err.println("IO error occur");
//            e.printStackTrace();
//        }
//        
//        session.unbindAndClose();
         } catch (SendFailedException ex) {
             Logger.getLogger(Validator.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
     public static void main(String args[]){
        for(int i=0;i<10;i++){
         sendMessageText(null, null);
        }
     }
     
}
