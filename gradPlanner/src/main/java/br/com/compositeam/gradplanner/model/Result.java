package br.com.compositeam.gradplanner.model;

public class Result {
	
	private Student student;
	//private ClassName classname; Commented because class not implemented yet.
	private String description;
	private Mention mention;
	private int period;
	
	//Empty constructor
	public Result()
	{
		
	}
	
	//Full constructor
	public Result(Student student, String description, Mention mention, int period)
	{
		this.student = student;
		this.description = description;
		this.mention = mention;
		this.period = period;
	}

	/*Getters and setters*/
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Mention getMention() {
		return mention;
	}

	public void setMention(Mention mention) {
		this.mention = mention;
	}

	public int getPeriod() {
		return period;
	}

	public void setPeriod(int period) {
		this.period = period;
	}
	

	
}
