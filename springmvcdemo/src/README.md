1.配置springmvc
   任何mvc的框架，都是需要在web.xml中进行核心配置的。
2.为了处理post请求，再配置一个encodingFilter,以避免post
  请求出现中文乱码情况
3.在配置完web.xml后，在resources文件下创建spring配置文件mvc-dispatcher.xml
  右键new-xml Config File -springConfig
4.创建好各种包和controller后，回到mvc-dispatcher.xml进行相关配置
5.现在，配置tomcat运行该项目
  编辑，deployment 选择artical,然后是下面那个war explored，就是下面那个
http://localhost:8081/test/ak.do

tips:RequestMapping和@PathVariable注解的一起使用
  @RequestMapping(value="/{id}/find.do",method = RequestMethod.GET)
    public String id(@PathVariable("id") Integer id,Model model){
        model.addAttribute("id",id);
        System.out.print("id:"+id);
        return "search";
    }
使用log4j步骤
1.首先是web.xml,在web.xml中加入如下配置
   <context-param>     
      <param-name>log4jConfigLocation</param-name>     
      <param-value>/WEB-INF/props/log4j.properties</param-value>     
   </context-param>     
   <context-param>     
      <param-name>log4jRefreshInterval</param-name>     
      <param-value>6000</param-value>     
   </context-param>
   <listener> 
         <listener-class> 
            org.springframework.web.util.Log4jConfigListener 
         </listener-class> 
      </listener>
   

拦截器

编写拦截器极其简单，只要编写一个类，实现HandlerInterceptor的方法，
然后在springMVC的配置文件中配置这个类，就可以使用了。
