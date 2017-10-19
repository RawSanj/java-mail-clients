# java-mail-clients


#### This demo is created to test the Java Mail Clients, to configure MailService is [jHipster] application as suggested in jHipster Tip - [Configuring Email with - Gmail]

### Version
1.1.RELEASE

### Note (for Gmail)
You must allow your Gmail account to access less secure apps.


Login to Gmail and visit [Here](https://www.google.com/settings/security/lesssecureapps) to Turn On Access for less secure apps.

[More Info here](https://support.google.com/accounts/answer/6010255)

### Installation

```sh
$ git clone https://github.com/RawSanj/java-mail-clients.git
```

#### Updated Version (added support for Attachments):

1. Update `ConfigConsts.java` file with *to* and *from* Email address and password.
2. Select the SMTP Server (GMAIL, YAHOO, OUTLOOK or ZOHO) and update the File path where the attachments are located.
3. Run the `SendEmailWithAttachments` class as Java Application. 

#### Older Version: 
1. Change the `sendToAddress`, `sendFromAddress` and `password` in the respective E-Mail client app and run as Java Application.


### Reference

Refer below links for API and SMTP settings:

* [JavaMail API] - JavaMail : version-1.5.4 
* [GMail SMTP] - Gmail SMTP Settings.
* [Outlook SMTP] - Outlook SMTP Settings.
* [Yahoo SMTP] - Yahoo SMTP Settings.
* [Zoho SMTP] - Zoho SMTP Settings.

### Tools

The following tools are used to create this project :

* Eclipse
* Google Chrome
* Git


### License
----

The MIT License (MIT)

Copyright (c) 2017. Sanjay Rawat


[//]: # (These are reference links used in the body of this note and get stripped out when the markdown processor does its job. There is no need to format nicely because it shouldn't be seen. Thanks SO - http://stackoverflow.com/questions/4823468/store-comments-in-markdown-syntax)

   [JavaMail API]: <http://www.oracle.com/technetwork/java/javamail/index.html>
   [GMail SMTP]: <https://support.google.com/a/answer/176600?hl=en>
   [Outlook SMTP]: <https://www.outlook-apps.com/outlook-com-pop-settings/>
   [Yahoo SMTP]: <http://www.serversmtp.com/en/smtp-yahoo>
   [Zoho SMTP]: <https://www.zoho.com/mail/help/zoho-smtp.html>
   [jHipster]: <http://www.jhipster.tech>
   [Configuring Email with - Gmail]: <http://www.jhipster.tech/tips/011_tip_configuring_email_in_jhipster.html>
