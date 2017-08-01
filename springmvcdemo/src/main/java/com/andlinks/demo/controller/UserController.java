package com.andlinks.demo.controller;

import com.andlinks.demo.entity.User;
import com.andlinks.demo.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by 陈亚兰 on 2017/7/28.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    IUserService userService;
    @RequestMapping(value="/list.do",method = RequestMethod.GET)
    public String list(@RequestParam("id")int id, Model model){
        User user=userService.findUserById(id);
        model.addAttribute("user",user);
        return "userList";
    }
}
