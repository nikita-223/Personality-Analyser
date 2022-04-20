/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personality;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Mohit
 */
public class SendMail {
       public static void send(String to, String sub,String msg, final String user, final String pass) 
    {
        Properties props = new Properties();
      /* props.put("mail.smtp.port", "587");
        props.put("mail.host", "smtp.mail.yahoo.com");
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.auth", "true");
         props.put("mail.debug", "false");
        props.put("mail.smtp.starttls.enable", "true");*/
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587"); 
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        
        Session session = Session.getDefaultInstance(props,new Authenticator() 
        {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() 
            {
                return new PasswordAuthentication(user, pass);
            }
        });
        //session.setDebug(true); 
        try 
        {
            Message message = new MimeMessage(session);
            
            message.setFrom(new InternetAddress(user));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            message.setSubject(sub);
            message.setText(msg);

            Transport.send(message);
            
            System.out.println("Email sended!");
            
        } catch (MessagingException e) 
        {
            System.out.println("Something happened!");
            
            throw new RuntimeException(e);
        }
    }}
