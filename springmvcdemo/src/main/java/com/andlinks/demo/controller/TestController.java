package com.andlinks.demo.controller;

import com.andlinks.demo.entity.Student;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


/**
 * Created by 陈亚兰 on 2017/7/10.
 */

@Controller

@RequestMapping(value="/test")
public class TestController {
    //private static Logger logger = Logger.getLogger(TestController.class);
    private static final Logger logger= LoggerFactory.getLogger(TestController.class);
    @RequestMapping(value="/ak.do",method = RequestMethod.GET)
    public String index(){
        return "index";
    }

    /**
     * find.do用来取出路径中的变量值
     * @param id
     * @param model
     * @return
     */
    @RequestMapping(value="/{id}/find.do",method = RequestMethod.GET)
    public String id(@PathVariable("id") Integer id,Model model){
        model.addAttribute("id",id);
        System.out.print("id:"+id);
        return "search";
    }

    /**
     * 添加用户
     * @param student
     * @param model
     * @return
     */
    @RequestMapping(value="/add.do",method = RequestMethod.POST)
    public String add(Student student,Model model){
        model.addAttribute(student);
        return "show";
    }
    @RequestMapping(value="/{id}/update.do",method = RequestMethod.GET)
    public String update(@PathVariable("id")Integer id, Model model,Student stu){
        logger.debug("用户更改信息");
        Student s=new Student();
        s.setUsername(stu.getUsername());
        model.addAttribute(s);
        model.addAttribute("id",id);
        logger.error("我是假装的错误");
        logger.info("我是普通的信息");
        return "show";
    }

    /**
     * test requestParam
     * @param username
     * @param age
     * @param model
     * @return
     */
    @RequestMapping(value="/request.do",method = RequestMethod.GET)
    public String getRequestParam(
            @RequestParam("username") String username,
            @RequestParam(value = "age", required = false,defaultValue = "19") int age,
            Model model){
              logger.info("my name is {}",username);
              logger.info("my age is {} {}",18,age);
              Student s=new Student();
              s.setUsername(username);
              s.setAge(age);
              model.addAttribute(s);
              return "show";
    }

    /**
     * test http请求头消息
     * @param language
     * @param accept
     * @param model
     * @return
     */
    @RequestMapping(value="/header.do",method = RequestMethod.GET)
    public String getHeader(
            @RequestHeader(value = "Accept-Language",required = false,defaultValue = "null")String language,
            @RequestHeader("Accept-Language") String accept,Model model) {
        logger.info("language is {}", language);
        logger.info("accept-language is {}", accept);
        model.addAttribute(new Student());
        return "show";
    }

    /**
     * test cookie
     * @param jsessionid
     * @param model
     * @return
     */
    @RequestMapping(value="/cookie.do",method = RequestMethod.GET)
    public String getCookie(
            @CookieValue(value="JSESSIONID") String jsessionid,
            Model model){
        logger.info("得到的cookie是{}",jsessionid);
        model.addAttribute(new Student());
        return "show";
    }
}