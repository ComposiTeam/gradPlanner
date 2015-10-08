package br.com.compositeam.gradplanner.model;

public class Result {
	
	private Student student;
	//private ClassName classname; Commented because class not implemented yet.

	private Discipline discipline;
	private Mention mention;
	private int period;
	
	//Empty constructor
	public Result()
	{
		
	}
	
	//Full constructor
	public Result(Student student, Discipline discipline, Mention mention, int period)
	{
		this.student = student;
		this.discipline = discipline;
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


	public Discipline getDiscipline() {
		return discipline;
	}

	public void setDiscipline(Discipline discipline) {
		this.discipline = discipline;
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
