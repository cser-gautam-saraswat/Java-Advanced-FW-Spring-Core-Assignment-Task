package com.capgemini.java_advanced.framework.spring.core.entity;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.java_advanced.framework.spring.core.entity.Student;

public class JavaApp {
	public static void execution() {
		String xmlConfigFile = "applicationContext.xml";
		ConfigurableApplicationContext configurableApplicationContext = new ClassPathXmlApplicationContext(xmlConfigFile);
		
		Student student = configurableApplicationContext.getBean("student", Student.class);
		System.out.println(student);
		configurableApplicationContext.close();
		
	}
}
