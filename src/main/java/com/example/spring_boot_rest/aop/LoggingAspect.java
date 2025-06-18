package com.example.spring_boot_rest.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

    // returnType fullyQualifiedClassName.methodName(arguments) ---
    // || - for to use two or more methods. ---> execution(* com.example.spring_boot_rest.service.JobService.getJob(..) || execution(* com.example.spring_boot_rest.service.JobService.updateJob(..)))
    @Before("execution(* com.example.spring_boot_rest.service.JobService.*(..))")
    public void logMethodCall(JoinPoint jp){
        LOGGER.info("METHOD CALLED" + jp.getSignature().getName());
    }


    @After("execution (* com.example.spring_boot_rest.service.JobService.getJob*(..)) || execution(* com.example.spring_boot_rest.service.JobService.updateJob*(..))")
    public void logMethodExecuted(JoinPoint jp) {
        LOGGER.info("Method Executed "+jp.getSignature().getName());
    }


    @AfterThrowing("execution (* com.example.spring_boot_rest.service.JobService.getJob*(..)) || execution(* com.example.spring_boot_rest.service.JobService.updateJob*(..))")
    public void logMethodCrashed(JoinPoint jp) {
        LOGGER.info("Method has some issues "+jp.getSignature().getName());
    }



    @AfterReturning("execution (* com.example.spring_boot_rest.service.JobService.getJob*(..)) || execution(* com.example.spring_boot_rest.service.JobService.updateJob*(..))")
    public void logMethodExecutedSuccess(JoinPoint jp) {
        LOGGER.info("Method Executed Successfully "+jp.getSignature().getName());
    }
}
