package execution;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entity.Product;
import entity.Student;


public class JavaApp {
	public static void execution() {
		String xmlConfigFile = "applicationContext.xml";
		ConfigurableApplicationContext configurableApplicationContext = new ClassPathXmlApplicationContext(xmlConfigFile);
		
//		Product product = configurableApplicationContext.getBean(Product.class);
		
		Student student = configurableApplicationContext.getBean(Student.class);
		System.out.println(student);
		Product product = student.getProduct();
		System.out.println(product);
	}
}
