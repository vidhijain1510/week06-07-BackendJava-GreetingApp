package com.greetingapp.model;

public class Greeting {
    /*private String message;

    public Greeting(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }*/

    private Long id;
    private String message;

    public Greeting(){

    }

    public Greeting(String message){
        this.message = message;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id=id;
    }
    public String getMessage(){
        return message;
    }
    public void setMessage(){
        this.message = message;
    }
}
