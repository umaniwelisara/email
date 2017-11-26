/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emaildemo;

import javax.mail.internet.AddressException;

/**
 *
 * @author Umani Welisara
 */
public class EmailDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws AddressException {
        // TODO code application logic here
        String[] to = {"testseventest91@gmail.com","umanithamarashee@gmail.com"}; // to mail
        if(EmailSender.sendEmail
        ("umanithamarashee@gmail.com",//from mail
                "umani1994@",//pw
                "message to reciepents" //message
                ,to))System.out.println("email sent successfully");
        else{
            System.out.println("some error occured");
        }
        
    }
    
}
