package webexam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class Application 
{
	public static void main(String[] args) 
	{
		SpringApplication.run(Application.class, args);
	}  	
	
	@Component
	public class SpringDataRestCustomization extends RepositoryRestConfigurerAdapter
	{	
	  @Override
	  public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) 
	  {
	    config.getCorsRegistry().addMapping("/**").allowedMethods("GET", "PUT")
		.allowedOrigins("http://localhost:4200");
		config.exposeIdsFor(User.class);
	  }
	}
}