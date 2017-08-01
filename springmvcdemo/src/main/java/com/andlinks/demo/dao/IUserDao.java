package com.andlinks.demo.dao;

import com.andlinks.demo.entity.User;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by 陈亚兰 on 2017/7/28.
 */
@Repository
public interface IUserDao {
//    List<Book> queryAll(@Param("offset") int offset, @Param("limit") int limit);
    public User findUserById(int id);//查询
    public void addUser(User user);//添加
}
