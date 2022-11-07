package com.example.web_customer_tracker.aop;


import org.apache.juli.logging.Log;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
@Order(1)
@Component
public class GeneralLoggingAspect {
    private final Logger logger = Logger.getLogger(this.getClass().getName());

    @Pointcut("execution(* com.example.web_customer_tracker.controller.*.*(..))")
    private void forControllerPackage(){}

    @Pointcut("execution(* com.example.web_customer_tracker.service.*.*(..))")
    private void forServicePackage(){}

    @Pointcut("execution(* com.example.web_customer_tracker.dao.*.*(..))")
    private void forDaoPackage(){}

    @Pointcut("forControllerPackage() || forServicePackage() || forDaoPackage()")
    private void forAppFlow(){}


    @Before("forAppFlow()")
    public void before(JoinPoint joinPoint) {
        logger.info(String.format("====> in @Before: calling method: %s",
                joinPoint.getSignature().toShortString()));
        logger.info(String.format("====> in @Before: arguments to the method: %s",
                Arrays.toString(joinPoint.getArgs())));
    }

    @AfterReturning(value = "forAppFlow()", returning = "result")
    public void after(JoinPoint joinPoint, Object result) {
        logger.info(String.format("====> in @AfterReturning: from method: %s",
                joinPoint.getSignature().toShortString()));
        logger.info(String.format("====> in @AfterReturning: returned: %s", result));
    }
}
