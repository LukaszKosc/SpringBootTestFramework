package net.koscielny.testframework;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BootTestFrameworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootTestFrameworkApplication.class, args);
	}

//	@Bean
//	public static CommandLineRunner commandLineRunner(String[] args) {
//		return runner -> {
//			System.out.println("Running SpringBoot app...");
//		};
//	}

}
