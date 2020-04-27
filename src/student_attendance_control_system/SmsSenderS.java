/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student_attendance_control_system;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

/**
 *
 * @author acer
 */
public class SmsSenderS {
        
        // Find your Account Sid and Auth Token at twilio.com/console
    public static final String ACCOUNT_SID =
            "AC234db67f4b51334b24c875873ef616c6";
    public static final String AUTH_TOKEN =
            "37fd88e1dddecba4fe0aad66dc45cbb7";

    public static void sendSms(String to, String messageStr) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        Message message = Message
                .creator(new PhoneNumber(to), // to
                        new PhoneNumber("+13182528406"), // from
                        messageStr)
                .create();

        System.out.println(message.getSid());
    }

    
}
