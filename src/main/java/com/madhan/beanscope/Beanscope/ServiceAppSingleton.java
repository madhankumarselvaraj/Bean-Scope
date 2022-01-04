/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.madhan.beanscope.Beanscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Madhankumar Selvaraj
 */
public class ServiceAppSingleton {

public static void main(String[] args) {

    ApplicationContext apConxt = new ClassPathXmlApplicationContext("Beans.xml");
    MessageService msgServ = (MessageService) apConxt.getBean("messageServices");
    msgServ.setMessage("Madhankumar");
    System.out.println(""+msgServ.getMessage());
    MessageService msgServ1 = (MessageService) apConxt.getBean("messageServices");
    System.out.println(""+msgServ1.getMessage());

}
}
