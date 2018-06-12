package com.etc.controller;

import com.etc.pojo.Person;
import com.etc.service.PersonService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PersonController {
    private static final String REGISTER="register" ;
    private static final String LOGIN="login";

    static PersonService personService=null;

    static {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        personService = (PersonService)ctx.getBean("PersonService");
    }


    @RequestMapping("register")
    public String register(Person person){
        int num= personService.register(person);
        if(num==1){
            System.out.println("注册");
            return REGISTER;
        }
        else {
            return LOGIN;
        }


    }
    /*@RequestMapping("login")
    public  String login(){
        System.out.println("母猪与大树");
        return MAIN;
    }*/




}
