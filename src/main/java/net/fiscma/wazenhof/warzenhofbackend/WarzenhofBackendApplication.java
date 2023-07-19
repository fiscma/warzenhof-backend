package net.fiscma.wazenhof.warzenhofbackend;

import jakarta.servlet.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import javax.faces.webapp.FacesServlet;
import java.util.Arrays;

@SpringBootApplication
public class WarzenhofBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(WarzenhofBackendApplication.class, args);
	}

	@Bean
	public ServletRegistrationBean servletRegistrationBean(ServletContext servletContext) {
		servletContext.setInitParameter("com.sun.faces.forceLoadConfiguration", Boolean.TRUE.toString());

		//registration
		ServletRegistrationBean srb = new ServletRegistrationBean();
		srb.setServlet(new FacesServlet());
		srb.setUrlMappings(Arrays.asList("*.xhtml"));
		srb.setLoadOnStartup(1);
		return srb;
	}

}
