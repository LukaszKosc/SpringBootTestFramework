package net.koscielny.testframework;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestBootTestFrameworkApplication {

	public static void main(String[] args) {
//		SpringApplication.from(BootTestFrameworkApplication::commandLineRunner).with(TestBootTestFrameworkApplication.class).run(args);
		SpringApplication.from(BootTestFrameworkApplication::main).with(TestBootTestFrameworkApplication.class).run(args);

		// idea: scan package ..tests - get all classes available -> add them to testing.xml in order to run them, make file created dynamically.
	}

}
