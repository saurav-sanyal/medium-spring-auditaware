package com.example.auditaware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@SpringBootApplication
@EnableMongoAuditing(auditorAwareRef = "auditorProvider")
public class AuditawareApplication {
    public static void main(String[] args) {
        SpringApplication.run(AuditawareApplication.class, args);
    }
}
