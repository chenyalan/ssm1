package com.andlinks.demo.controller;

import com.andlinks.demo.entity.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.RequestContext;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.Locale;


/**
 * Created by 陈亚兰 on 2017/7/11.
 */
@Controller
@SessionAttributes("student")//sessionAttributes只能声明在类上不能声明在方法上
@RequestMapping("/student")
public class AddStudent {
    public static final Logger log= LoggerFactory.getLogger(AddStudent.class);
    @ModelAttribute("user")
    public Student testAttribute(Student student,ModelMap modelMap){
        modelMap.addAttribute("s",student);
        log.info("111111111");
        return student;
    }
    @RequestMapping(value = "/add.do",method = RequestMethod.POST)
    public String add(@Valid Student student, BindingResult result,
                      Model model, ModelMap modelMap,
                      HttpServletRequest request){
        RequestContext req=new RequestContext(request);
        model.addAttribute("welcome",req.getMessage("welcome"));
                Student stest= (Student) modelMap.get("user");
        log.info("stest:"+stest.getUsername());
        if(result.getErrorCount()>0){
            for(FieldError error : result.getFieldErrors()){
                log.info(error.getField()+"  "+error.getDefaultMessage() );
            }
        }
       // model.addAttribute(student);
        modelMap.put("stu",stest);
        log.info(student.toString());
        return "listStudent";
    }
    /**
     * 测试重定向
     */
    @RequestMapping(value="/testRedirectOrForward.do",method = RequestMethod.GET)
    public String redirect(@RequestParam("id")int id){
        if(id==1){
            log.info("{}重定向",id);
            return "redirect:/static/redirect.jsp";
        }else{
            log.info("{}转发",id);
            return "forward:/static/forward.jsp";
        }
    }
    @RequestMapping(value="/test.do",method = RequestMethod.GET)
    public String red(@RequestParam("id") int id){
        if(id==1){
            return  "redirect:/student/testRedirectOrForward.do?id="+id;
        }else{
            return "forward:/student/testRedirectOrForward.do?id="+id;
        }
    }
}
