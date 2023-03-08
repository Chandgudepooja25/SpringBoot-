package StudentTrainer.entity;



public class Trainer 
{
	public static  Subject subject;
	public Trainer(Subject subject)
	{
		super();
		this.subject = subject;
	}
	public static void teach()
	{
		System.out.println("Trainer is Teach"+ subject.getSubjectname());
	}

}
