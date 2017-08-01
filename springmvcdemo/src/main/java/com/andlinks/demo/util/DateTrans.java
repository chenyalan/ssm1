package com.andlinks.demo.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by 陈亚兰 on 2017/7/27.
 */
public class DateTrans {
    private static final SimpleDateFormat sdf =   new SimpleDateFormat( " yyyy-MM-dd" );
    private static final SimpleDateFormat sdfhms =   new SimpleDateFormat( " yyyy-MM-dd HH:mm:ss " );
    //1.把字符串转成Date类型的日子
    public static Date getDateDay(String d) throws ParseException {
        Date date=sdf.parse(d);
        return date;
    }
    //2.把字符串转成Date类型精确到时分秒
    public static Date getDateHMS(String d) throws ParseException {
        Date date=sdfhms.parse(d);
        return date;
    }
    //----------------------------
    //把日期转成字符串
    public static String getStringDay(Date date){
        String strDay=sdf.format(date);
        return strDay;
    }
    public static String getStringHMS(Date date){
        String strHMS=sdfhms.format(date);
        return strHMS;
    }
}
