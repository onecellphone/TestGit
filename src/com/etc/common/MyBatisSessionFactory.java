package com.etc.common;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class MyBatisSessionFactory {
    private static  String resource="mybatis-config.xml";
    private static SqlSessionFactory sqlSessionFactory = null;

    static{
        try{
            //把mybatis-config.xml总配置文件变成Inputstream
            InputStream inputStream = Resources.getResourceAsStream(resource);
            //把inputsteam转化为SqlsessionFactory
            sqlSessionFactory =new SqlSessionFactoryBuilder().build(inputStream);

    }catch (Exception e){

        }
    }
    /*单例模式*/
    public static SqlSession getSession(){
       if(sqlSessionFactory!=null){
           return sqlSessionFactory.openSession();
       }
       return null;
    }

}
