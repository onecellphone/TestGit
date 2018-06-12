package com.etc.dao;

import com.etc.common.MyBatisSessionFactory;
import com.etc.pojo.Person;
import org.apache.ibatis.session.SqlSession;

public class PersonDaoImpl implements PersonDAO {
    SqlSession sqlSession =null;
    @Override
    public  int register(Person person){
        int num= 0;

        try{
            sqlSession = MyBatisSessionFactory.getSession();
            num=sqlSession.insert("register",person);
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
        return num;
    }
}
