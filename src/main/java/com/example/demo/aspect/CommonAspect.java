package com.example.demo.aspect;


import com.example.demo.annotation.MyAnnotation;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Objects;
import java.util.logging.Logger;

/**
 * @author fanzq22858
 * @version $Id: CommonAspect.java, v 0.1 2018/7/16 15:45 Exp $
 */
@Aspect
@Component
public class CommonAspect {

    private Logger logger = Logger.getLogger(String.valueOf(Component.class));

    @Around(value = "@annotation(com.example.demo.annotation.MyAnnotation)")
    public Object beforeDoMethod(ProceedingJoinPoint jp) throws Throwable{
        Signature signature = jp.getSignature();
        MethodSignature methodSignature = (MethodSignature) signature;

        Method method = methodSignature.getMethod();
        if (method.getDeclaringClass().isInterface()){
            method = jp.getTarget().getClass().getDeclaredMethod(methodSignature.getName(),methodSignature.getParameterTypes());
        }
        MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
        String value = annotation.value();
        if (value == null || Objects.equals("",value)){
            logger.info("公共写入日志注解没配置正确的操作");
            throw new Exception("公共写入日志注解没配置正确的操作");
        }
        System.out.println(value);

        return jp.proceed();
    }
}
