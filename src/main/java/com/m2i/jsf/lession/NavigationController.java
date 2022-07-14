/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.m2i.jsf.lession;

import javax.faces.bean.ManagedBean;


@ManagedBean(name = "navigationController", eager = true)
public class NavigationController {

   public String moveToHello() {
       return "hello";
   }
    
}
