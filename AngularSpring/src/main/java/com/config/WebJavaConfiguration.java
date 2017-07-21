package com.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * Add an initializer class implementing WebApplicationInitializer under 
 * src/main/java with specified package as shown below
 * (which in this case acts as replacement of any spring configuration defined in web.xml). 
 * During Servlet 3.0 Container startup, this class will be loaded and instantiated and 
 * its onStartup method will be called by servlet container.
 * @author pflores
 *
 */
public class WebJavaConfiguration implements WebApplicationInitializer{
	
	

	@Override
	public void onStartup(ServletContext container) throws ServletException {
		AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(ResolutionViewConfiguration.class);
        ctx.setServletContext(container);
        ServletRegistration.Dynamic servlet = container.addServlet("dispatcher", new DispatcherServlet(ctx));
        
        servlet.setLoadOnStartup(1);
        servlet.addMapping("/");		
	}

}

