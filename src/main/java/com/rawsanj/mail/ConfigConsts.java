package com.rawsanj.mail;

public final class ConfigConsts {

    // Recipient's email ID needs to be mentioned.
    public static final String TO_EMAIL_ADDRESS = "sendToAddress@example.com";

    // Sender's email ID needs to be mentioned
    public static final String FROM_EMAIL_ADDRESS = "sendFromAddress@gmail.com";

    // Email address for Login
    public static final String USER_NAME_EMAIL = "sendFromAddress@gmail.com";

    // Email password for Login
    public static final String USER_PASSWORD = "********";

    // Physical Folder Path
    public static final String FILE_PATH = "path/to/files";

    // Set SMTP Server Address - GMAIL, OUTLOOK, YAHOO or ZOHO
    public static final String SMPT_HOST_ADDRESS = MailServers.GMAIL.getAddress();

    // Server name - gets reflected in email message Subject and body
    public static final String SMPT_HOST_NAME = MailServers.GMAIL.getName();

}
