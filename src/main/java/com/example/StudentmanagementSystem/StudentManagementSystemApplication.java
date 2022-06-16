package com.example.StudentmanagementSystem;

import com.example.StudentmanagementSystem.entity.Student;
import com.example.StudentmanagementSystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {

//		Student s1 = new Student("Anthony","Joshua","ak.12635@akc.com");
//		Student s2 = new Student("Gaitonde","Namu","gn.12635@akc.com");
//		Student s3 = new Student("Parle","Zee","pz.12635@akc.com");
//
//		studentRepository.save(s1);
//		studentRepository.save(s2);
//		studentRepository.save(s3);
	}
}
