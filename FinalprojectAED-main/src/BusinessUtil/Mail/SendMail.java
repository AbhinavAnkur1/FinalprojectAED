/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessUtil.Mail;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author indian
 */
public class SendMail {
    
    public static void sendMail(String recepient, String msg){
        
        System.out.println("Preparing to send email");
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        //properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.host", "smtp.mail.yahoo.com");
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.ssl.trust", "*");
        
        String senderEmail = "abhinnankit@yahoo.com";
        String senderPassword = "plborvxxpaaprupw";
        String userName = "abhinnankit";
        
        Session session = Session.getInstance(properties, new javax.mail.Authenticator(){
            //@Override
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(userName, senderPassword);
            }
        });  
        
        Message message = prepareMessage(session,senderEmail, recepient, msg);
         
        try {
            Transport.send(message);
            System.out.println("Email sent Successfully!");
        } catch (MessagingException ex) {
            Logger.getLogger(SendMail.class.getName()).log(Level.SEVERE, null, ex);
        }
   
    }

    private static Message prepareMessage(Session session,String senderEmail, String recepientEmail, String msg){
        
        //recepientEmail = emailTxt.getText();
      
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(senderEmail));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepientEmail));
            message.setSubject("Welcome to our Healthcare");
            message.setText(msg);
            return message;
        } catch (Exception ex) {
            Logger.getLogger(SendMail.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
