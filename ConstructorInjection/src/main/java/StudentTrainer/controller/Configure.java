package StudentTrainer.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import StudentTrainer.entity.Subject;
import StudentTrainer.entity.Trainer;

//Configuration annotation indicates that the class has @Bean definition methods
@Configuration
public class Configure 
{
	//@Bean Annotation is applied on a method to specify that it returns a bean to be managed by Spring context
	@Bean
	public Subject subject()
	{
		return new Subject("COMP");
	}
	
	@Bean
	public Trainer trainer()
	{
		return new Trainer(subject());
	}


}
