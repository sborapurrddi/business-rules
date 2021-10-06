package com.example.kata.businessrules.email;

public class sendEmail {

    String to;
    String sub;
    String body;

    public sendEmail(String to, String sub, String body) {
        this.to = to;
        this.sub = sub;
        this.body = body;
    }

    public void sendEmailToUser()
    {
        System.out.println("Email sent successfully to " + to + "with subject " + sub + "with body:" + body);
    }
}
