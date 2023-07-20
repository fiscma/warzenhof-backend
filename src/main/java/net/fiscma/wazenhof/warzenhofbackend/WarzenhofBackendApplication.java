package net.fiscma.wazenhof.warzenhofbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.faces.webapp.FacesServlet;
import java.util.Arrays;

@SpringBootApplication
@EnableWebMvc
@EnableAutoConfiguration
public class WarzenhofBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(WarzenhofBackendApplication.class, args);
	}

	@Bean
	public ServletRegistrationBean servletRegistrationBean() {
		FacesServlet servlet = new FacesServlet();
		return new ServletRegistrationBean();
	}

}
