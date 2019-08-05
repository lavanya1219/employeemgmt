package com.dbs.emp_mgmt.aspect;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    
    @Before("within(com.dbs.emp_mgmt.*.*)")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("Before Executing the method :: ");
        Arrays.asList(joinPoint.getArgs()).forEach(System.out::println);
    }
    
    @After("within(com.dbs.emp_mgmt.*.*)")
    public void logAfter() {
        System.out.println("After executing the method :: ");
    }
}
