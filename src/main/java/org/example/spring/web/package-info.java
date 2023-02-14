package org.example.spring.web;
/**
 * 体系结构
 * 1、客户端发出HTTP请求，Web应用服务器接收到这个请求。如果匹配DispatcherServlet的请求映射路径（在web.xml中配置），则Web容器将该请求转交给
 * DispatcherServlet处理。
 * 2、DispatcherServlet接收到请求后，根据请求的信息及HandlerMapping的配置找到处理请求的Handler。
 * 3、DispatcherServlet根据HandlerMapping得到当前请求的Handler后，通过HandlerAdapter对Handler进行封装，再以统一的适配器接口调用Handler。
 * 4、Handler完成业务逻辑后将返回一个ModelAndView给DispatcherServlet，ModelAndView包含了视图逻辑名和模型数据信息。
 * 5、DispatcherServlet借由ViewResolver完成逻辑名视图到真实视图对象View的解析工作。
 * 6、DispatcherServlet使用View对象对ModelAndView中模型数据进行视图渲染。
 * 7、客户端得到响应信息。
 */
/**
 * spring-mvc包下的DispatcherServlet.properties文件包含了预加载的Bean。
 */