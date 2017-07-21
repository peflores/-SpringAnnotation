package com.config;

import org.springframework.beans.BeansException;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.spring4.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;
/**
 * configuramos el resolutor de vista.
 * 
 * @author pflores
 *
 *	@Configuration indicates that this class contains one or more bean methods annotated with 
 *	@Bean producing bean manageable by spring container. Above Configuration class is equivalent 
 *	to following XML counterpart:
 */
@Configuration
public class ResolutionViewConfiguration extends SpringBootServletInitializer {
	
	
	 @Bean
    public SpringResourceTemplateResolver templateResolver() {
		 SpringResourceTemplateResolver servletContextTemplateResolver = new  SpringResourceTemplateResolver();
        servletContextTemplateResolver.setPrefix("/WEB-INF/views/");
        servletContextTemplateResolver.setSuffix(".html");
        return servletContextTemplateResolver;
    }
	 @Bean
    public SpringTemplateEngine templateEngine() {
	 SpringTemplateEngine springTemplateEngine = new SpringTemplateEngine();
	 
	 springTemplateEngine.setTemplateResolver(templateResolver());
	 return springTemplateEngine;
    }
	@Bean 
	public ThymeleafViewResolver thymeleafViewResolver() {
		ThymeleafViewResolver thymeleafViewResolver = new ThymeleafViewResolver();
		thymeleafViewResolver.setTemplateEngine(templateEngine());
		thymeleafViewResolver.setOrder(1);
		return thymeleafViewResolver;
	}
	@Bean
	public ThymeleafViewResolver viewResolver(){
	    ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
	    viewResolver.setTemplateEngine(templateEngine());
	    viewResolver.setOrder(1);
	    return viewResolver;
	}	
	 
}
