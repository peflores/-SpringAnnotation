package servlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableAutoConfiguration
@ComponentScan(basePackages= {"rest"})
@SpringBootApplication
public class Servlet extends SpringBootServletInitializer {

	 public static void main(String[] args) {
	        SpringApplication.run(Servlet.class, args);
	    }

	 @Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		// TODO Auto-generated method stub
		return builder.sources(Servlet.class);
	}
}
