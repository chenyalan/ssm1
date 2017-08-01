第一步：新建applicationContext-dao.xml
1.读入数据库连接相关参数(可选)
2.配置数据连接池
3.配置连接属性，可以不读配置项文件直接在这里写死
4.配置c3p0,只配置几个常用的
5.配置SqlSessionFactory对象(mybatis)
6.扫描dao层接口，动态实现dao接口，也就是说不需要daoImpl,sql和参数都写在xml文件上

第二步：因为这里用到了mybatis,所以需要配置mybatis核心文件，
       在resources文件夹里新建mybatis-config.xml文件
    1.使用自增主键
    2.使用列别名
    3.开启驼峰命名转换 create_time->createTime
    