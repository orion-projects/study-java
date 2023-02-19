package org.example.spring.web.exception;
/**
 * 默认装配
 * 1、ExceptionHandlerExceptionResolver
 *    允许通过@ExceptionHandler注解指定特定的异常处理方法。
 * 2、ResponseStatusExceptionResolver
 *    允许通过@ExceptionStatus注解指定特定的异常处理方法。
 * 3、DefaultHandlerExceptionResolver
 *    Spring MVC内置的异常解析类，定义了常见的异常类与HTTP状态码之间的对应关系。
 *
 * @ExceptionStatus
 * 1、修饰类。
 *    为异常类指定对应的状态码和错误原因。
 * 2、修饰方法。
 *    通常与@ExceptionHandler结合使用。
 */