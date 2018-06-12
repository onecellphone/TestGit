package com.etc.junit;

import com.etc.dao.PersonDAO;
import com.etc.pojo.Person;
import org.junit.Test;

import java.util.List;

public class JunitTest {
    /*PersonDAO personDAO = new PersonDAO();*/

   /* @Test
    public void testRegister(){
        Person person = new Person();
        person.setName("0033");
        person.setPassword("111111");

        int num = personDAO.register(person);
        System.out.println(num);
    }
    @Test
    public void testdelete(){
        int id = 4;

        int num = personDAO.deletebyoneperson(id);
        System.out.println(num);
    }
    @Test
    public void testupdate(){
        Person person = new Person();
        person.setPassword("33333");
        person.setId(2);

        int num = personDAO.updatebyoneperson(person);
        System.out.println(num);
    }

    @Test
    public void testselectAllperson(){
        List<Person> list = personDAO.selectAllperson();
        System.out.print(list.size());

       for(int i =0;i<list.size();i++){
           System.out.print(list.get(i).getId());
           System.out.print(list.get(i).getName());
           System.out.print(list.get(i).getPassword());
       }
    }*/


}
