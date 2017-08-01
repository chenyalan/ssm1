package com.andlinks.demo.util;

import com.andlinks.demo.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Reader;
import java.text.ParseException;
import java.util.Date;

/**
 * Created by 陈亚兰 on 2017/7/27.
 */
public class Test {
    private static SqlSessionFactory sqlSessionFactory;
    private static Reader reader;
    private static final Logger log= LoggerFactory.getLogger(Test.class);
    static{
        try{
            reader= Resources.getResourceAsReader("com/resources/mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        }catch(Exception e){
           log.error("解析mybatis-config错误");
        }
    }

    public static SqlSessionFactory getSession(){
        return sqlSessionFactory;
    }

    public static void main(String[] args) throws ParseException {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            User user=new User();
            user.setSex("女");
            user.setName("无视开");
          //  user.setBirthday(DateTrans.getDateDay("1994-04-94"));
//            session.insert("add",user);
            session.selectOne("findByName","chen");
        } finally {
            session.close();
        }
    }
}
