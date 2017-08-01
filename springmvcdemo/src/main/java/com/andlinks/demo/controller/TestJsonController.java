package com.andlinks.demo.controller;

import com.andlinks.demo.entity.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by 陈亚兰 on 2017/7/11.
 */
@RestController
@RequestMapping(value="/json")
public class TestJsonController {
    private static final Logger log= LoggerFactory.getLogger(TestJsonController.class);
    @RequestMapping(value="/show.do",method = RequestMethod.GET)
    public Student show(Student s){
        log.info(s.toString());
        return s;
    }
}
