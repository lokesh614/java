package javajenkins.exapmle.javajenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaJenkinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaJenkinsApplication.class, args);
		System.out.println("hello this is java-jenkins");
	}

}
