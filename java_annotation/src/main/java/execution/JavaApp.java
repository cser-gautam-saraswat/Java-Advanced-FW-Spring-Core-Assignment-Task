package execution;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import configuration.JavaConfigurationFile;
import entity.Product;
import entity.Student;


public class JavaApp {
	public static void execution() {
		
		ConfigurableApplicationContext configurableApplicationContext;
		configurableApplicationContext = new AnnotationConfigApplicationContext(JavaConfigurationFile.class);
				
		Student student = configurableApplicationContext.getBean(Student.class);
		System.out.println(student);
		Product product = student.getProduct();
		System.out.println(product);
		configurableApplicationContext.close();
	}
}
