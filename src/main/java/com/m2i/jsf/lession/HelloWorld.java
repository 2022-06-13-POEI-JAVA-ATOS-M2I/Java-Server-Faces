package com.m2i.jsf.lession;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

@ManagedBean(name = "helloWorld", eager = true)
public class HelloWorld {

    @ManagedProperty(value = "#{message}")
    private Message messageBean;
    private String message;

    public HelloWorld() {
        System.out.println("HelloWorld started!");
    }

    public String getMessage() {

        if (messageBean != null) {
            message = messageBean.getMessage();
        }
        return message;
    }

    public void setMessageBean(Message message) {
        this.messageBean = message;
    }

}
