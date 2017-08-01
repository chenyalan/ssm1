package com.andlinks.demo.service;

import com.andlinks.demo.entity.User;

import java.util.List;

/**
 * Created by 陈亚兰 on 2017/7/10.
 */
public interface IUserService {
    public User findUserById(int id);//查询
    public void addUser(User user);//添加
}
