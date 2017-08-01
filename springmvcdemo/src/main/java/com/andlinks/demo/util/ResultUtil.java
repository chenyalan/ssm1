package com.andlinks.demo.util;

/**
 * Created by 陈亚兰 on 2017/7/12.
 */
public class ResultUtil {
    private String code;
    private String info;
    public ResultUtil(){}
    public ResultUtil(String code){
        this.code=code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public ResultUtil(String code, String info){
        this.code=code;
        this.info=info;

    }
}
