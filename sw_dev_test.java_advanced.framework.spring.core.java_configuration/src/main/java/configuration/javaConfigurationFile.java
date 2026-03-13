package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import entity.Project;
import entity.Student;

@Configuration
public class javaConfigurationFile {
	
//	@Bean
//	public Student student1() {
//		return new Student(1, "Raja","raja@gmail.com", 789654123L);
//	}
//	@Bean
//	public Student student2() {
//		return new Student(2, "Rani","rani@gmail.com", 7896578523L);
//	}
	
	@Bean
	public Project project1() {
		return new Project(1, "test", "Ai based");
	}
	
	@Bean
	public Student student1() {
		return new Student(1, "Raja", "Raja@gmail.com", 456987123L, project1());
	}
	
	
}
