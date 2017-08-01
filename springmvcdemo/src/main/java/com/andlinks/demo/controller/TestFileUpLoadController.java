package com.andlinks.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.*;
import java.util.Date;

/**
 * Created by 陈亚兰 on 2017/7/12.
 */
@Controller
@RequestMapping("/fileupload")
public class TestFileUpLoadController {
    private static final Logger log= LoggerFactory.getLogger(TestFileUpLoadController.class);
    @RequestMapping(value = "/file.do",method = RequestMethod.POST)
    public String fileUpload(@RequestParam(value="file",required = false)MultipartFile files[]) throws IOException {
        for(MultipartFile file : files){
            System.out.println(file.getOriginalFilename());//得到文件的原始名字
            System.out.println(file.getName());//得到文件的字段的名字”file
            InputStream in = file.getInputStream();
            OutputStream out = new FileOutputStream("d:/"+file.getOriginalFilename());
            int len=0;
            byte[] buf =new byte[1024];
            while((len=in.read(buf))!=-1){
                out.write(buf);
                out.flush();
            }
            out.close();
            in.close();
        }
        return "fileSuccess";
    }
    @RequestMapping(value="do2.do",method = RequestMethod.POST)
    public String  fileUpload(@RequestParam("file") CommonsMultipartFile file) throws IOException {


        //用来检测程序运行时间
        long  startTime=System.currentTimeMillis();
        System.out.println("fileName："+file.getOriginalFilename());

        try {
            //获取输出流
            OutputStream os=new FileOutputStream("D:/"+new Date().getTime()+file.getOriginalFilename());
            //获取输入流 CommonsMultipartFile 中可以直接得到文件的流
            InputStream is=file.getInputStream();
            int temp;
            //一个一个字节的读取并写入
            while((temp=is.read())!=(-1))
            {
                os.write(temp);
            }
            os.flush();
            os.close();
            is.close();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        long  endTime=System.currentTimeMillis();
        System.out.println("方法一的运行时间："+String.valueOf(endTime-startTime)+"ms");
        return "fileSuccess";
    }

    @RequestMapping(value = "/do3.do",method = RequestMethod.POST)
    public String  fileUpload2(@RequestParam("file") CommonsMultipartFile file) throws IOException {
        long  startTime=System.currentTimeMillis();
        System.out.println("fileName："+file.getOriginalFilename());
        String path="D:/"+new Date().getTime()+file.getOriginalFilename();
        File newFile=new File(path);
        //通过CommonsMultipartFile的方法直接写文件（注意这个时候）
        file.transferTo(newFile);
        long  endTime=System.currentTimeMillis();
        System.out.println("方法二的运行时间："+String.valueOf(endTime-startTime)+"ms");
        return "fileSuccess";
    }
}
