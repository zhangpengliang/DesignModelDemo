package zpl.model.visit.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * ������
 * 
 * @author zpl
 *
 */
@SpringBootApplication
@ComponentScan(basePackages = { "com.*" })
public class StartApplication {

	public static void main(String[] args) {
		SpringApplication.run(StartApplication.class, args);
	}

}
