#### 2019-10-21:
###### 1、在类AdLevelDataHandler中创建了2、3、4层级的索引信息加载方法。


#### 2019-10-20:
###### 1、对所有表对应的数据创建索引对象与索引接口类和操作类。
###### 2、编写DataTable类(可以算工厂类)，注入该类获取所有想要的index对象。
###### 3、编写对象Table类与测试类，从数据库中查询出索引的Table类型表对象，分别写入data目录下json格式。
###### 4、初步编写将数据转换为索引的操作类handler。


#### 2019-10-19:
###### 1、实现了广告推广单元的service层业务及请求vo对象。
###### 2、实现了广告推广单元关联的三个维度的service层业务操作及请求vo对象。
###### 3、实现了广告创意的service层业务及请求vo对象。
###### 4、实现了服务的controller层的restFul接口。
###### 5、配置ad-sponsor服务的路由网关信息。
###### 6、将数据库表SQL编写了。(需要手动创建数据库)
###### 7、搭建search服务并配置了路由信息。
###### 8、编写了ribbon方式与feign方式的两种远程服务调用controller方式。


#### 2019-10-18:
###### 1、定义了JPA的数据库持久层操作DAO接口。
###### 2、定义了请求的vo request对象以及响应的vo response对象。
###### 3、实现了广告投放用户与推广计划的service层业务操作。


#### 2019-10-17:
###### 1、搭建了业务逻辑service的pom父工程项目。
###### 2、创建common项目，定义了统一前端的返回对象并通过注解类忽略特定对象。
###### 3、定义的统一的异常处理类、json的消息转换配置类。
###### 4、定义了用户、计划、推广单元、维度、创意实体类对象及相关的枚举类。


#### 2019-10-16:
###### 1、搭建了pom的父工程项目及其pom文件。
###### 2、搭建了单机版的eureka服务。
###### 3、搭建了集群版的eureka服务，与单机版只是application.yaml的差异，要java -jar xxx --spring.profiles.active=名称 分别启动服务。
###### 4、搭建了路由网关服务，用淘汰版的zuul实现；并创建了两个过滤器记录请求的耗时。


### 广告投放系统概念：
#### 用户账户、推广计划、推广单元、创意，计划(1)-》单元(n)、单元(n)-》创意(n)
#### 推广单元-》关键词限制、地域限制、兴趣限制...
