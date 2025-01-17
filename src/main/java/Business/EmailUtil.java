package Business;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

public class EmailUtil {

    public static void sendEmail(String toEmail, String subject, String body) {
        String fromEmail = "edulink.aed@gmail.com"; // Replace with your email
        String password = "xwtdrltobxgqxhdo";          // Replace with your email password

        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com"); // SMTP Host
        props.put("mail.smtp.port", "587");           // TLS Port
        props.put("mail.smtp.auth", "true");          // Enable Authentication
        props.put("mail.smtp.starttls.enable", "true"); // Enable STARTTLS

        // Create a Session with the properties and authentication
        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromEmail, password);
            }
        });

        try {
            // Create a MimeMessage
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(fromEmail));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail));
            message.setSubject(subject);
            message.setText(body);

            // Send the message
            Transport.send(message);

            System.out.println("Email sent successfully to " + toEmail);
        } catch (MessagingException e) {
            e.printStackTrace();
            System.err.println("Error sending email: " + e.getMessage());
        }
    }
}
