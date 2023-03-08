package StudentTrainer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import StudentTrainer.entity.Trainer;


@RestController
public class TrainerController
{
	private Trainer trainer;

	public TrainerController(Trainer trainer) {
		super();
		this.trainer = trainer;
	}
	
	@GetMapping("/teach")
	public String teach()
	{
		Trainer.teach();
		
		return "Training Completed Sucessfully!";
		
	}
	
}
