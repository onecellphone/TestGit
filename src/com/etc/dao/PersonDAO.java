package com.etc.dao;

import com.etc.common.MyBatisSessionFactory;
import com.etc.pojo.Person;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.List;

public interface PersonDAO {
    /*SqlSession sqlSession = null;*/
    public  int register(Person person);

















   /* public  int register(Person person){
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
    public  int deletebyoneperson(int id){
        int num= 0;

        try{
            sqlSession = MyBatisSessionFactory.getSession();
            num=sqlSession.delete("deletebyoneperson",id);
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
        return num;
    }
    public  int updatebyoneperson(Person person){
        int num= 0;

        try{
            sqlSession = MyBatisSessionFactory.getSession();
            num=sqlSession.update("updatebyoneperson",person);
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
        return num;
    }
    public List<Person> selectAllperson(){
        List<Person> list = new ArrayList<>();
        try{
            sqlSession = MyBatisSessionFactory.getSession();
            list = sqlSession.selectList("selectAllperson");
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
        return list;
    }*/
}
