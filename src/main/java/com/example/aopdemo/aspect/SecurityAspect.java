package com.example.aopdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SecurityAspect {

    private String currentUserRole = "VIP";

    @Before("execution(* com.example.aopdemo.service..*.add*(..))")
    public void verifyUser(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();

        if (!"ADMIN".equals(currentUserRole)) {
            throw new RuntimeException(
                    "TRUY CẬP BỊ TỪ CHỐI: User không có quyền gọi phương thức " + methodName
            );
        }

        System.out.println("SECURITY: User có quyền thực hiện " + methodName);
    }
}