package com.andlinks.demo.service.impl;


import com.andlinks.demo.dao.IUserDao;
import com.andlinks.demo.entity.User;
import com.andlinks.demo.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 陈亚兰 on 2017/7/28.
 */
@Service
public class UserServiceImpl implements IUserService {
    private Logger logger= LoggerFactory.getLogger(this.getClass());

    @Autowired
    IUserDao iUserDao;

    public User findUserById(int id) {
        return iUserDao.findUserById(id);
    }

    public void addUser(User user) {
        iUserDao.addUser(user);
    }
}
