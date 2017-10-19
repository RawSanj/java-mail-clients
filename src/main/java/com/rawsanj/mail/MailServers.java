package com.rawsanj.mail;

public enum MailServers {

    GMAIL("GMAIL", "smtp.gmail.com"),
    OUTLOOK("OUTLOOK", "smtp-mail.outlook.com"),
    YAHOO("YAHOO", "smtp.mail.yahoo.com"),
    ZOHO("ZOHO", "smtp.zoho.com");

    private final String name;
    private final String address;

    MailServers(String name, String address) {
        this.address = address;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

}
