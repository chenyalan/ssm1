package com.andlinks.demo.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;
import java.io.Reader;

/**
 * Created by 陈亚兰 on 2017/7/27.
 */
public class SqlSessionFactoryPack {
    private static SqlSessionFactory  sqlSessionFactory =null;
    private static SqlSession sqlSession;
    private static  final Logger logger=LoggerFactory.getLogger(SqlSessionFactoryPack.class);
    //初始化创建SqlSessionFactory对象
    static {
        try {
            //读取mybatis-config.xml文件
            String resource="mybatis-config.xml";
            Reader reader = Resources.getResourceAsReader(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (Exception e) {
            logger.error("读取mybatis配置文件错误");
        }
    }
        //获取SqlSession对象的静态方法
    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }
    //获取    SqlSessionFactory的静态方法
    public static SqlSessionFactory getSqlSessionFactory(){
        return sqlSessionFactory;
    }
}
