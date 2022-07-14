/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.m2i.jsf.lesson;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

@ManagedBean(name = "navigationController", eager = true)
public class NavigationController {

    @ManagedProperty(value = "#{param.pageId}")
    private String pageId;

    public String moveToHello() {
        return "hello";
    }

    public String goToPage() {
        if (pageId == null) {
            return "home";
        }

        if (pageId.equals("hello")) {
            return "hello";
        } else if (pageId.equals("page2")) {
            return "page2";
        }

        return "home";
    }

    public String getPageId() {
        return pageId;
    }

    public void setPageId(String pageId) {
        this.pageId = pageId;
    }

}
