package com.example;

import com.example.service.WorkerSalary;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestSpringAuto2Application {

	public static void main(String[] args) {
		BeanFactory beanFactory = SpringApplication.run(TestSpringAuto2Application.class, args);
		beanFactory.getBean(WorkerSalary.class).print(1);
	}
}
