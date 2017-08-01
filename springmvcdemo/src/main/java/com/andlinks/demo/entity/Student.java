package com.andlinks.demo.entity;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.util.Date;

/**
 * Created by 陈亚兰 on 2017/7/10.
 */
public class Student {
    public Date getBecomeStudent() {
        return becomeStudent;
    }

    public void setBecomeStudent(Date becomeStudent) {
        this.becomeStudent = becomeStudent;
    }
    @Past
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date becomeStudent;
    @NotBlank(message = "用户名不能为空")
    private String username;
    public enum Sex{
        FEMALE,
        MALE
    }
    public Student.Sex sex;
    @Min(12)
    public int age;
    private Aclass aClass;
    public Aclass getaClass() {
        return aClass;
    }

    public void setaClass(Aclass aClass) {
        this.aClass = aClass;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
