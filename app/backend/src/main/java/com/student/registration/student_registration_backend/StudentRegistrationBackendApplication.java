package com.student.registration.student_registration_backend;
	
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
	
@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.student.registration.student_registration_backend.repository")
@EntityScan(basePackages = "com.student.registration.student_registration_backend.model")
public class StudentRegistrationBackendApplication {
	
        public static void main(String[] args) {
                SpringApplication.run(StudentRegistrationBackendApplication.class, args);
        }
	
}
