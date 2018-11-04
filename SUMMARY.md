# 《Spring 5 开发大全》目录


第1章Spring 5 概述

1.1 Spring 与 Java EE

1.1.1 Java 平台发展简史

1.1.2 Java EE 现状

重点1.1.3 Spring 与 Java EE 的关系

1.2 Spring 简史

1.2.1 挑衅 EJB

1.2.2 化繁为简

难点1.2.3 Spring 设计哲学

重点1.2.4 面向未来的 Spring

1.3 Spring 5 的新特性

1.3.1 基准升级

1.3.2 兼容 JDK 9

1.3.3 响应式编程模型

1.3.4 函数式编程

1.3.5 多语言的支持

1.3.6 支持 HTTP/2

1.3.7 清理了代码

1.3.8 更强的测试套件

1.4 快速开启第一个 Spring 应用

实战1.4.1 Hello World项目概述

重点1.4.2 使用 Maven

重点1.4.3 使用 Gradle

重点1.4.4 创建服务类

1.4.5 创建打印器

1.4.6 创建应用主类

1.4.7 运行

1.5 Gradle 与 Maven 的抉择

1.5.1 Maven 概述

1.5.2 Gradle 概述

1.5.3 Gradle 与 Maven 对比

第2章Spring 框架核心概念

2.1 Spring 框架总览

重点2.1.1 Spring 的狭义与广义

2.1.2 Spring 框架概述

难点2.1.3 Spring 框架常用模块

2.1.4 Spring 设计模式

2.2 IoC 容器

难点2.2.1 依赖注入与控制反转

难点2.2.2 IoC 容器和 bean

重点2.2.3 配置元数据

重点2.2.4 实例化容器

2.2.5 使用容器

2.2.6 bean 的命名

2.2.7 实例化 bean 的方式

重点2.2.8 注入方式

重点2.2.9 实战：依赖注入的例子

2.2.10 依赖注入的详细配置

难点2.2.11 使用 depends-on

2.2.12 延迟加载 bean

重点2.2.13 自动装配

2.2.14 方法注入

难点2.2.15 bean scope

重点2.2.16 singleton bean 与 prototype bean

2.2.17 request、session、application 及 websocket scope

2.2.18 自定义 scope

2.2.19 实战：自定义 scope 的例子

2.2.20 自定义 bean 的生命周期

难点

2.2.21 bean 定义继承

难点

2.2.22 容器扩展点

2.2.23 实战：容器扩展的例子

重点2.2.24 基于注解的配置

2.2.25 基于注解的配置与基于 XML 的配置

重点2.2.26 类路径扫描及组件管理

2.2.27 JSR-330 规范注解

重点2.2.28 基于 Java 的容器配置

重点2.2.29 环境抽象

2.2.30 国际化

2.2.31 事件与监听器

2.3 AOP 编程

2.3.1 AOP 概述

重点2.3.2 AOP 核心概念

2.3.3 Spring AOP

难点2.3.4 AOP 代理

2.3.5 使用 @AspectJ

2.3.6 实战：使用 @AspectJ 的例子

重点2.3.7 基于 XML 的 AOP

2.3.8 实战：基于 XML 的 AOP 例子

2.3.9 如何选择 AOP 类型

难点2.3.10 理解代理机制

2.3.11 创建 @AspectJ 代理

2.4 资源处理

重点2.4.1 常用资源接口

2.4.2 内置资源接口实现

2.4.3 ResourceLoader

重点2.4.4 ResourceLoaderAware

2.4.5 资源作为依赖

2.5 Bean 验证

重点2.5.1 Bean 验证概述

2.5.2 Validator 接口

2.6 表达式语言 SpEL

2.6.1 SpEL 概述

难点2.6.2 表达式接口

2.6.3 对于 bean 定义的支持

重点2.6.4 常用表达式

2.6.5 实战：使用 SpEL 的例子

2.7 数据缓冲器和编解码器

2.7.1 数据缓冲器

2.7.2 编解码器

2.8 空安全

2.8.1 空安全概述

2.8.2 如何使用

第3章测试

3.1 测试概述

3.1.1 传统的测试所面临的问题

3.1.2 如何破解测试面临的问题

3.2 测试的类型和范围

3.2.1 测试类型

3.2.2 测试范围

3.2.3 测试比例

3.3 如何进行微服务的测试

3.3.1 微服务的单元测试

3.3.2 mock 与 stub 的区别

3.3.3 微服务的集成测试

3.3.4 微服务的系统测试

第4章单元测试

4.1 Mock 对象

重点4.1.1 Environment

4.1.2 JNDI

重点4.1.3 Servlet API

新功能4.1.4 Spring Web Reactive

4.2 测试工具类

4.2.1 测试工具

4.2.2 测试 Spring MVC

第5章集成测试

5.1 集成测试概述

难点5.1.1 上下文管理与缓存

重点5.1.2 测试夹具的依赖注入

重点5.1.3 事务管理

重点5.1.4 集成测试类

测试5.1.5 JDBC

5.2 测试相关的注解

5.2.1 @BootstrapWith

5.2.2 @ContextConfiguration

5.2.3 @WebAppConfiguration

5.2.4 @ContextHierarchy

5.2.5 @ActiveProfiles

5.2.6 @TestPropertySource

5.2.7 @DirtiesContext

5.2.8 @TestExecutionListeners

5.2.9 @Commit

5.2.10 @Rollback

5.2.11 @BeforeTransaction

5.2.12 @AfterTransaction

5.2.13 @Sql

5.2.14 @SqlConfig

5.2.15 @SqlGroup

5.2.16 标准注解

5.2.17 Spring JUnit 4 注解

新功能5.2.18 Spring JUnit Jupiter 注解

5.2.19 元注解

难点5.3 Spring TestContext 框架

5.3.1 Spring TestContext 框架概述

5.3.2 核心抽象

5.3.3 引导 TestContext

5.3.4 TestExecutionListener 配置

难点5.3.5 上下文管理

5.3.6 测试夹具的依赖注入

难点5.3.7 如何测试 request bean 和 session bean

重点5.3.8 事务管理

5.3.9 执行 SQL 脚本

新功能5.3.10 并行测试

新功能5.3.11 SpringExtension 测试类

5.4 Spring MVC Test 框架

5.4.1 服务端测试概述

难点5.4.2 选择测试策略

重点5.4.3 设置测试功能

重点5.4.4 执行请求

难点5.4.5 定义期望

5.4.6 注册过滤器

5.4.7 脱离容器的测试

5.4.8 实战：服务端测试的例子

5.4.9 HtmlUnit 集成

5.4.10 客户端 REST 测试

5.4.11 实战：客户端 REST 测试的例子

★新功能 5.5 WebTestClient

5.5.1 WebTestClient 概述

5.5.2 设置 WebTestClient

5.5.3 如何编写测试用例

5.5.4 处理空内容

5.5.5 处理 JSON

5.5.6 处理流式响应

第6章事务管理

6.1 事务管理概述

6.1.1 Spring 事务管理优势

难点6.1.2 Spring 事务模型

6.2 通过事务实现资源同步

6.2.1 高级别的同步方法

6.2.2 低级别的同步方法

6.2.3 TransactionAwareDataSourceProxy

6.3 声明式事务管理

重点6.3.1 声明式事务管理

6.3.2 实战：声明式事务管理的例子

重点6.3.3 事务回滚

6.3.4 配置不同的事务策略

重点6.3.5 @Transactional 详解

重点6.3.6 事务传播机制

6.4 编程式事务管理

6.4.1 编程式事务管理概述

6.4.2 声明式事务管理和编程式事务管理

6.5 事件中的事务

第7章DAO

7.1 DAO 概述

7.2 DAO 常用异常类

7.3 DAO 常用注解

第8章基于 JDBC 的数据访问

8.1 Spring JDBC 概述

8.1.1 不同的 JDBC 访问方式

8.1.2 Spring JDBC 包

8.2 JDBC 核心类

重点8.2.1 JdbcTemplate

8.2.2 实战：使用 JdbcTemplate 的例子

8.2.3 NamedParameterJdbcTemplate

8.2.4 SQLExceptionTranslator

重点8.2.5 执行语句

重点8.2.6 运行查询

重点8.2.7 更新数据

8.2.8 检索自动生成的主键

8.3 控制数据库连接

8.4 批处理

8.4.1 使用 JdbcTemplate 实现批处理

8.4.2 批量更新 List

8.4.3 多个批次更新

8.5 SimpleJdbc 类

8.5.1 使用 SimpleJdbcInsert 插入数据

8.5.2 使用 SimpleJdbcInsert 检索自动生成的主键

8.5.3 使用 SqlParameterSource

8.5.4 使用 SimpleJdbcCall

8.6 JDBC 转为对象模型

8.6.1 SqlQuery

8.6.2 MappingSqlQuery

8.6.3 SqlUpdate

8.6.4 StoredProcedure

8.6.5 实战：JDBC 转为对象模型的例子

8.7 内嵌数据库

重点8.7.1 使用内嵌数据库的好处

8.7.2 使用 Spring XML 创建内存数据库

8.7.3 编程方式创建内存数据库

8.7.4 实战：使用内存数据库进行测试的例子

8.8 初始化 DataSource

第9章基于 ORM 的数据访问

9.1 Spring ORM 概述

9.2 ORM 集成注意事项

重点9.2.1 资源与事务管理

难点9.2.2 异常处理

9.3 集成 Hibernate

重点9.3.1 设置 SessionFactory

9.3.2 基于 Hibernate 的 DAO

重点9.3.3 声明式事务

重点9.3.4 编程事务

9.3.5 事务管理策略

9.4 JPA

9.4.1 设置 JPA 不同方式

重点9.4.2 基于 JPA 的 DAO

9.4.3 JPA 事务

重点9.4.4 JpaDialect

9.4.5 JTA 事务管理

第10章XML 与对象的转换

10.1 XML 解析概述

10.2 XML 的序列化与反序列化

10.2.1 序列化接口 Marshaller

10.2.2 反序列化接口 Unmarshaller

10.2.3 XML 解析异常类

重点10.2.4 如何使用 XML 的序列化与反序列化

10.2.5 XML 配置命名空间

10.3 常用 XML 解析工具

10.3.1 JAXB

10.3.2 Castor

10.3.3 JiBX

10.3.4 XStream

10.3.5 实战：使用 JAXB 解析 XML 的例子

第11章Spring Web MVC

11.1 Spring Web MVC 概述

11.2 DispatcherServlet

11.2.1 DispatcherServlet 概述

重点11.2.2 上下文层次结构

11.2.3 特定的 bean

重点11.2.4 框架配置

11.2.5 容器配置

11.2.6 处理流程

11.2.7 拦截

11.2.8 视图解析

11.2.9 语言环境

重点11.2.10 Multipart 请求

11.3 过滤器

11.3.1 HTTP PUT 表单

11.3.2 转发头

11.3.3 ShallowEtagHeaderFilter

11.3.4 CORS

11.4 控制器

11.4.1 控制器概述

重点11.4.2 声明控制器

重点11.4.3 请求映射

重点11.4.4 处理器方法

重点11.4.5 模型方法

11.4.6 绑定器方法

11.5 URI 处理

11.5.1 URI 链接

11.5.2 链接到控制器

11.5.3 视图中的链接

11.6 异常处理

11.6.1 异常处理概述

11.6.2 @ExceptionHandler

11.6.3 框架异常处理

11.6.4 REST API 异常

11.6.5 注解异常

11.6.6 容器错误页面

11.7 异步请求

难点11.7.1 异步请求处理流程

11.7.2 异常处理

11.7.3 异步拦截器

难点11.7.4 流式响应

重点11.7.5 Server-Sent Events

11.7.6 发送原生数据

新功能11.7.7 响应式返回值

11.7.8 配置

11.8 CORS 处理

重点11.8.1 CORS 概述

重点11.8.2 @CrossOrigin

11.8.3 全局 CORS 配置

11.8.4 自定义CORS

11.8.5 CORS 过滤器

11.9 HTTP 缓存

11.9.1 HTTP 缓存概述

重点11.9.2 缓存控制

重点11.9.3 静态资源

11.9.4 控制器缓存

11.10 MVC 配置

11.10.1 启用 MVC 配置

11.10.2 类型转换

11.10.3 验证

重点 11.10.4 拦截器

11.10.5 内容类型

重点11.10.6 消息转换器

重点11.10.7 视图控制器

重点11.10.8 视图解析器

重点11.10.9 静态资源

11.10.10 DefaultServletHttpRequestHandler

难点11.10.11 路径匹配

11.11 视图处理

重点11.11.1 常用视图技术

11.11.2 文档视图

11.11.3 Feed 视图

★新功能 11.12 HTTP/2

11.12.1 TLS 的考虑

11.12.2 容器配置

实战11.13 基于 Spring Web MVC 的 REST 接口

11.13.1 系统概述

难点11.13.2 接口设计

重点11.13.3 系统配置

重点11.13.4 后台编码实现

重点11.13.5 应用配置

11.13.6 运行

第12章REST 客户端

12.1 RestTemplate

★新功能 12.2 WebClient

实战12.3 基于 RestTemplate 的天气预报服务

重点12.3.1 系统配置

重点12.3.2 后台编码实现

12.3.3 运行

第13章WebSocket

13.1 WebSocket 概述

13.1.1 HTTP和WebSocket

重点13.1.2 理解 WebSocket 使用场景

13.2 WebSocket 常用 API

重点13.2.1 WebSocketHandler

13.2.2 WebSocket 握手

13.2.3 部署

重点13.2.4 配置

13.2.5 跨域处理

13.3 SockJS

13.3.1 SockJS 概述

13.3.2 启用 SockJS

13.3.3 心跳

13.3.4 客户端断开连接

13.3.5 CORS 处理

13.3.6 SockJsClient

13.4 STOMP

13.4.1 STOMP 概述

13.4.2 启用 STOMP

重点13.4.3 消息流程

13.4.4 处理器方法

重点13.4.5 发送消息

13.4.6 内嵌 Broker和外部 Broker

重点13.4.7 连接到 Broker

13.4.8 认证

重点13.4.9 用户目的地

13.4.10 事件和拦截

13.4.11 STOMP 客户端

13.4.12 WebSocket Scope

难点13.4.13 性能优化

13.5 基于 STOMP 的聊天室

实战13.5.1 聊天室项目的概述

重点13.5.2 设置 Broker

重点13.5.3 服务端编码

重点13.5.4 客户端编码

13.5.5 运行

第14章Spring WebFlux

★新功能 14.1 响应式编程概述

14.1.1 响应式编程简述

重点14.1.2 Spring WebFlux 与 Spring MVC 的区别

重点14.1.3 响应式 API

难点14.1.4 响应式编程模型

★新功能 14.2 Spring 中的响应式编程

重点14.2.1 HttpHandler

重点14.2.2 WebHandler API

14.2.3 编码器和解码器

★新功能 14.3 DispatcherHandler

重点14.3.1 Spring WebFlux 常用 bean

14.3.2 配置

14.3.3 执行

★新功能 14.4 控制器

重点14.4.1 @Controller

重点14.4.2 请求映射

重点14.4.3 处理器方法

★新功能 14.5 常用函数

重点14.5.1 HandlerFunction

重点14.5.2 RouterFunction

14.5.3 运行服务器

14.5.4 HandlerFilterFunction

★新功能 14.6 WebFlux 相关配置

重点14.6.1 启用 WebFlux

难点14.6.2 配置 WebFlux

重点14.6.3 数据转换

重点14.6.4 数据验证

重点14.6.5 内容类型解析器

重点14.6.6 HTTP 消息编码器和解码器

重点14.6.7 视图解析器

重点14.6.8 静态资源

重点14.6.9 路径匹配

★新功能 14.7 CORS 处理

重点14.7.1 CORS 概述

重点14.7.2 @CrossOrigin

14.7.3 全局CORS 配置

14.7.4 自定义CORS

14.7.5 CORS 过滤器

第15章响应式编程中的 WebClient

★新功能 重点 15.1 retrieve() 方法

★新功能 重点 15.2 exchange() 方法

★新功能 15.3 请求主体

重点15.3.1 处理 Form 表单数据

重点15.3.2 处理文件上传数据

★新功能 15.4 生成器

★新功能 15.5 过滤器

★新功能 实战 15.6 基于 WebClient 的文件上传、下载

15.6.1 应用的概述

重点15.6.2 文件上传的编码实现

重点15.6.3 文件下载的编码实现

15.6.4 运行

第16章响应式编程中的 WebSocket

16.1 WebSocket 概述

16.2 WebSocket 常用 API

重点16.2.1 WebSocketHandler

16.2.2 WebSocket 握手

重点16.2.3 配置

16.2.4 跨域处理

★新功能 16.3 WebSocketClient

第17章常用集成模式

17.1 Spring 集成模式概述

17.2 使用 RMI

重点17.2.1 使用 RmiServiceExporter 暴露服务

重点17.2.2 客户端访问服务

17.3 使用 Hessian

重点17.3.1 编写 DispatcherServlet

重点17.3.2 使用 HessianServiceExporter 暴露 bean

重点17.3.3 客户端访问服务

17.3.4 在 Hessian 中使用基本认证

17.4 使用 HTTP

重点17.4.1 暴露服务

重点17.4.2 客户端访问服务

17.5 Web 服务

重点17.5.1 暴露基于 JAX-WS 的 Web 服务

重点17.5.2 访问服务

17.6 JMS

17.6.1 JMS 概述

重点17.6.2 服务端配置

重点17.6.3 客户端配置

17.7 REST 服务

重点17.7.1 RestTemplate

17.7.2 HTTP 消息转换器

第18章EJB 集成

18.1 EJB 集成概述

18.2 EJB 集成的实现

18.2.1 访问本地 SLSB

18.2.2 访问远程 SLSB

第19章JMS 集成

19.1 JMS 集成概述

19.2 Spring JMS

重点19.2.1 JmsTemplate

重点19.2.2 连接管理

重点19.2.3 目的地管理

19.2.4 消息监听器容器

重点19.2.5 事务管理

19.3 发送消息

19.3.1 使用消息转换器

19.3.2 回调

19.4 接收消息

19.4.1 同步接收

重点19.4.2 异步接收

19.4.3 SessionAwareMessageListener

19.4.4 MessageListenerAdapter

19.4.5 处理事务

重点

19.5 JCA 消息端点

19.6 基于注解的监听器

19.6.1 启用基于注解的监听器

重点19.6.2 编程式端点注册

重点19.6.3 基于注解的端点方法签名

19.6.4 响应管理

19.7 JMS 命名空间

难点19.8 基于 JMS 的消息发送、接收

19.8.1 项目概述

19.8.2 配置

19.8.3 编码实现

19.8.4 运行

第20章JMX 集成

20.1 JMX 集成概述

20.2 bean 转为 JMX

重点20.2.1 创建 MBeanServer

20.2.2 重用 MBeanServer

20.2.3 延迟实例化 MBean

20.2.4 MBean 自动注册

重点20.2.5 控制注册行为

20.3 bean 的控制管理

20.3.1 MBeanInfoAssembler

重点20.3.2 注解

20.3.3 AutodetectCapableMBeanInfoAssembler

重点20.3.4 定义管理接口

20.3.5 MethodNameBasedMBeanInfoAssembler

20.4 通知

20.4.1 注册监听器

20.4.2 发布通知

第21章JCA CCI 集成

21.1 JCA CCI 集成概述

21.2 配置 CCI

21.2.1 连接器配置

21.2.2 ConnectionFactory 配置

21.2.3 配置连接

21.3 使用 CCI 进行访问

21.3.1 记录转换

重点21.3.2 CciTemplate

21.3.3 DAO

21.3.4 自动输出记录生成

21.4 CCI 访问对象建模

21.4.1 MappingRecordOperation

21.4.2 MappingCommAreaOperation

21.5 CCI 中的事务处理

第22章使用 E-mail

22.1 使用 E-mail 概述

22.2 实现发送 E-mail

重点22.2.1 MailSender 和 SimpleMailMessage 的基本用法

重点22.2.2 JavaMailSender 和 MimeMessagePreparator 的用法

22.3 使用 MimeMessageHelper

难点22.3.1 发送附件和内联资源

重点22.3.2 使用模板创建 E-mail 内容

实战22.4 实现 E-mail 服务器

22.4.1 项目概述

22.4.2 E-mail 服务器编码实现

22.4.3 格式化 E-mail 内容

22.4.4 运行

第23章任务执行与调度

23.1 任务执行与调度概述

23.2 TaskExecutor

23.2.1 TaskExecutor 类型

23.2.2 使用 TaskExecutor

23.3 TaskScheduler

23.3.1 Trigger 接口

23.3.2 实现

23.4 任务调度及异步执行

23.4.1 启用调度注解

重点23.4.2 @Scheduled

重点23.4.3 @Async

23.4.4 @Async 的异常处理

23.4.5 命名空间

23.5 使用 Quartz Scheduler

23.5.1 使用 JobDetailFactoryBean

23.5.2 使用 MethodInvokingJobDetailFactoryBean

实战23.6 基于 Quartz Scheduler 的天气预报系统

23.6.1 项目概述

23.6.2 后台编码实现

23.6.3 运行

第24章缓存

24.1 缓存概述

24.2 声明式缓存注解

重点24.2.1 @Cacheable

重点24.2.2 @CachePut

重点24.2.3 @CacheEvict

重点24.2.4 @Caching

24.2.5 @CacheConfig

重点24.2.6 启用缓存

24.2.7 使用自定义缓存

24.3 JCache 注解

24.3.1 JCache 注解概述

24.3.2 与 Spring 缓存注解的差异

24.4 基于 XML 的声明式缓存

24.5 配置缓存存储

24.5.1 基于 JDK 的缓存

24.5.2 基于 Ehcache 的缓存

24.5.3 基于 Caffeine 的缓存

24.5.4 基于 GemFire 的缓存

24.5.5 基于 JSR-107 的缓存

实战 24.6 基于缓存的天气预报系统

24.6.1 项目概述

24.6.2 后台编码实现

24.6.3 缓存配置

24.6.4 运行

第25章Spring Boot

25.1 从单块架构到微服务架构

25.1.1 单块架构的概念

重点25.1.2 单块架构的优缺点

难点25.1.3 将单块架构进化为微服务架构

25.2 微服务设计原则

难点25.2.1 拆分足够“微”

重点25.2.2 轻量级通信

难点25.2.3 领域驱动原则

重点25.2.4 单一职责原则

重点25.2.5 DevOps 及两个比萨原则

重点25.2.6 不限于技术栈

重点25.2.7 可独立部署

25.3 Spring Boot 概述

难点25.3.1 Spring Boot 产生的背景

重点25.3.2 Spring Boot 的目标

重点25.3.3 Spring Boot 与其他 Spring 应用的关系

重点25.3.4 Starter

实战25.4 开启第一个 Spring Boot 项目

25.4.1 通过 Spring Initializr 初始化一个 Spring Boot 原型

25.4.2 用 Gradle 编译项目

25.4.3 探索项目

第26章Spring Cloud

★新功能 26.1 Spring Cloud 概述

26.1.1 Spring Cloud 简介

26.1.2 Spring Cloud 与 Spring Boot 的关系

★新功能 26.2 Spring Cloud 入门配置

重点26.2.1 Maven 配置

重点26.2.2 Gradle 配置

重点26.2.3 声明式方法

★新功能 26.3 Spring Cloud 的子项目介绍

26.3.1 Spring Cloud 子项目的组成

重点26.3.2 Spring Cloud 组件的版本

★新功能 实战 26.4 实现微服务的注册与发现

26.4.1 服务发现的意义

重点26.4.2 集成 Eureka Server

重点26.4.3 集成 Eureka Client

重点26.4.4 实现服务的注册与发现

附录

附录A EJB 规范摘要

A1 EJB 2.1 规范目标

A2 EJB 3.2 规范目标

附录B Bean Validation 内置约束

附录C 提升 Gradle 的构建速度

附录D 本书所采用的技术及相关版本

参考文献
