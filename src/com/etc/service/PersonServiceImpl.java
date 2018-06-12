package com.etc.service;

import com.etc.dao.PersonDAO;
import com.etc.pojo.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonServiceImpl implements PersonService {
    static PersonDAO personDAO = null;

    static {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        personDAO=(PersonDAO) ctx.getBean("PersonDAO");
    }

    @Override
    public int register(Person person) {
        return personDAO.register(person);
    }
}
