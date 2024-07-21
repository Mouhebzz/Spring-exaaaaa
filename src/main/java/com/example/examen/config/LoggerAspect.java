package com.example.examen.config;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@Aspect
public class LoggerAspect {
    @After("execution(* com.example.examen.Service.ServiceDonation.addDonation(..))")
    public void apres(JoinPoint thisJoinPoint) {
        log.info("Merci pour ce don" );
    }


}
