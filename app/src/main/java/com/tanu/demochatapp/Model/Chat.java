package com.tanu.demochatapp.Model;

public class Chat {
   private String sender;

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isIsseen() {
        return isseen;
    }

    public void setIsseen(boolean isseen) {
        this.isseen = isseen;
    }

    private String receiver;
    private String message;
    private boolean isseen;

    public Chat(String sender , String receiver , String message , boolean isseen){
        this.sender=sender;
        this.receiver=receiver;
        this.message=message;
        this.isseen=isseen;
    }

    Chat(){

    }



}
