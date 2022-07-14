package com.m2i.jsf.lession;


import javax.faces.bean.ManagedBean;


@ManagedBean(name = "message", eager = true)
public class Message {

    private String message = "Message from new bean !";

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    
    
}
