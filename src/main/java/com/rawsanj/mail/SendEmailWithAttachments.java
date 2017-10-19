package com.rawsanj.mail;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

public class SendEmailWithAttachments {

   public static void main(String[] args) {

      // Set Java Mail Properties
      Properties props = new Properties();
      props.put("mail.smtp.auth", "true");
      props.put("mail.smtp.starttls.enable", "true");
      props.put("mail.smtp.host", ConfigConsts.SMPT_HOST_ADDRESS);
      props.put("mail.smtp.port", "587");
      props.put("mail.smtp.ssl.trust", ConfigConsts.SMPT_HOST_ADDRESS);

      // Get the Session object.
      Session session = Session.getInstance(props,
      new Authenticator() {
         protected PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(ConfigConsts.USER_NAME_EMAIL, ConfigConsts.USER_PASSWORD);
         }
      });

      // Get all files in Folder
      File filesInPath = new File(ConfigConsts.FILE_PATH);
      List<File> listOfFlies = Arrays.asList(filesInPath.listFiles());

      try {
         // Create a default MimeMessage object.
         Message message = new MimeMessage(session);

         // Set From: header field of the header.
         message.setFrom(new InternetAddress(ConfigConsts.FROM_EMAIL_ADDRESS));

         // Set To: header field of the header.
         message.setRecipients(Message.RecipientType.TO,
         InternetAddress.parse(ConfigConsts.TO_EMAIL_ADDRESS));

         // Set Subject: header field
         message.setSubject(ConfigConsts.SMPT_HOST_NAME + " - Email Test");

         // Get Multipart Object with Message Body and Attachments
         Multipart multipart = MailMessageUtils.messageMultipart(listOfFlies);

         // Set the multiplart object (message body + files) to the message object
         message.setContent(multipart );

         // Send message
         Transport.send(message);

         System.out.println("Sent message successfully.... from "+ ConfigConsts.SMPT_HOST_NAME);

      } catch (MessagingException e) {
            throw new RuntimeException(e);
      }
   }

}