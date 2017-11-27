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

         // Now set the actual message
         message.setText("Your account is active. You can now to register yourself to clean 24 Saint Cyprians place.");

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
     
    
}
