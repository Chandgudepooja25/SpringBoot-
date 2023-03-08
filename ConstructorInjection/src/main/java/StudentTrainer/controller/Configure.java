package StudentTrainer.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import StudentTrainer.entity.Subject;
import StudentTrainer.entity.Trainer;


@Configuration
public class Configure 
{
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
