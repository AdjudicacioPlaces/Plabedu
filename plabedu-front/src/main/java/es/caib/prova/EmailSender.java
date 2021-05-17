package es.caib.prova;

import java.io.UnsupportedEncodingException;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.SendFailedException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailSender {

	static final String FROM = "no-reply@caib.es";
	static final String FROMNAME = "PLABEDU";

	static final String TO = "jose.miguel.rivas.22@gmail.com";

	static final String HOST = "scorlin1.caib.es";
	
	static final int PORT = 8091;

	static final String SUBJECT = "Wildfly test";

	static final String BODY = String.join(System.getProperty("line.separator"), "<h1>Wildfly Email Test</h1>",
			"<p>This email was sent with Wildfly using the SMTP service</p>");

	public static void sendEmail() {

		Properties props = System.getProperties();
		props.put("mail.transport.protocol", "smtp");
		props.put("mail.smtp.host", HOST);
		props.put("mail.smtp.port", PORT); 
		props.put("mail.debug", "false");
		props.put("mail.smtp.auth", "false");

		Session session = Session.getDefaultInstance(props);

		MimeMessage msg = new MimeMessage(session);
		try {
			msg.setFrom(new InternetAddress(FROM, FROMNAME));
		} catch (UnsupportedEncodingException e) {
			System.out.println("UnsupportedEncodingException. Error on setFrom().");
			System.out.println(e.getMessage());
		} catch (MessagingException e) {
			System.out.println("MessagingException. Error on setFrom().");
			System.out.println(e.getMessage());
		}
		try {
			msg.setRecipient(Message.RecipientType.TO, new InternetAddress(TO));
		} catch (MessagingException e) {
			System.out.println("MessagingException. Error on setRecipient().");
			System.out.println(e.getMessage());
		}
		try {
			msg.setSubject(SUBJECT);
		} catch (MessagingException e) {
			System.out.println("MessagingException. Error on setSubject().");
			System.out.println(e.getMessage());
		}
		try {
			msg.setContent(BODY, "text/html");
		} catch (MessagingException e) {
			System.out.println("MessagingException. Error on setContent().");
			System.out.println(e.getMessage());
		}

		Transport transport=null;

		// Send the message.
		try {
			System.out.println("Sending...");
			transport = session.getTransport();
			transport.connect();
			transport.sendMessage(msg, msg.getAllRecipients());
			System.out.println("Email sent!");
		} catch (SendFailedException e) {
			System.out.println("SendFailedExsception. The email was not sent.");
			System.out.println(e.getMessage());
		} catch (MessagingException e) {
			System.out.println("MessagingException. The email was not sent.");
			System.out.println(e.getMessage());
		}finally {
			// Close and terminate the connection.
			try {
				transport.close();
			} catch (MessagingException e) {
				System.out.println("MessagingException. The transport could not be closed.");
				System.out.println(e.getMessage());
			}
		}
	}
}