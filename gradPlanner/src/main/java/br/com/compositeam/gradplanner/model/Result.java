package br.com.compositeam.gradplanner.model;



public class Result {
	
	private Student student;
	private Class className;
	private Discipline discipline;
	private Mention mention;
	private ClassPeriod period;
	
	//Empty constructor
	public Result()
	{
		
	}
	
	//Full constructor
	public Result(Student student, Discipline discipline ,String description, Mention mention, ClassPeriod period)
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

	
	public Class getClassName() {
		return className;
	}

	public void setClassName(Class className) {
		this.className = className;
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

	public ClassPeriod getPeriod() {
		return period;
	}

	public void setPeriod(ClassPeriod period) {
		this.period = period;
	}
	
	

	
}
