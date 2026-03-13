package execution;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import configuration.javaConfigurationFile;
import entity.Project;
import entity.Student;

public class JavaApp {
	public static void execution() {
		ConfigurableApplicationContext configurableApplicationContext = new AnnotationConfigApplicationContext(javaConfigurationFile.class);
//		Student student1 = configurableApplicationContext.getBean("student1",Student.class);
//		System.out.println(student1);
//		Student student2 = configurableApplicationContext.getBean("student2",Student.class);
//		System.out.println(student2);
		
		
		Project project = configurableApplicationContext.getBean("project1",Project.class);
		Student student = configurableApplicationContext.getBean("student1",Student.class);
		
		student.setProject(project);
		System.out.println(student);
		
		
	}
}
