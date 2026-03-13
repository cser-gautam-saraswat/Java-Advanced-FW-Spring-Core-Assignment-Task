package configuration;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import entity.Project;
import entity.Student;

@Configuration
public class javaConfigurationFile {
	
	@Bean
	public Project project1() {
		return new Project(1, "test1","Ai 1");
	}
	
	@Bean
	public Project project2() {
		return new Project(2, "test2","Ai 2");
	}
	
	@Bean
	public Project project3() {
		return new Project(3, "test3","Ai 3");
	}
	
	@Bean
	public Student student1() {
		
		List<Project> projects = new ArrayList<>();
		projects.add(project1());
		projects.add(project2());
		projects.add(project3());
		return new Student(1,"raja","raja2gmail.com",789654123L, projects);
	}

	
}
