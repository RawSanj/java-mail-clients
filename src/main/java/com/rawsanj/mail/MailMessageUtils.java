package com.rawsanj.mail;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMultipart;
import java.io.File;
import java.util.List;

public class MailMessageUtils {

    // Return Multipart Object which holds mail body message and attachment files in BodyParts
    public static Multipart messageMultipart(List<File> listOfFlies) throws MessagingException {

        // BodyPart to hold message body
        BodyPart messageBody = new MimeBodyPart();
        // Now set the actual message
        messageBody.setText("Hello, this is sample email with attachments to check/send "
                + "email using JavaMailAPI from "+ ConfigConsts.SMPT_HOST_NAME);

        // Multipart will hold messageBodyPart and attachments
        Multipart multipart = new MimeMultipart();

        // Add Message BodyPart to Multipart
        multipart.addBodyPart(messageBody);

        // Add Files to multipart
        addFileToMultipart(listOfFlies, multipart);

        return multipart;
    }

    // Adding attachment files to Multipart
    private static void addFileToMultipart(List<File> listOfFlies, Multipart multipart) {

        listOfFlies.stream()
                .filter(file -> file.isFile())
                .forEach(f -> {
                    try {
                        multipart.addBodyPart(addAttachment(f));
                    } catch (MessagingException e) {
                        e.printStackTrace();
                    }
                });
    }

    private static MimeBodyPart addAttachment(File file) throws MessagingException{

        MimeBodyPart attachmentBodyPart = new MimeBodyPart();
        DataSource source = new FileDataSource(file);
        attachmentBodyPart.setDataHandler(new DataHandler(source));
        attachmentBodyPart.setFileName(file.getName());

        return attachmentBodyPart;
    }

}
