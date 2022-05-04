package com.example.springphonebook.Phonebook;

public class Response {

    String message;

    public Response(String message, Boolean bool) {
        this.message = message;
        this.bool = bool;
    }

    Boolean bool;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getBool() {
        return bool;
    }

    public void setBool(Boolean bool) {
        this.bool = bool;
    }

}


