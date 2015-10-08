package br.com.compositeam.gradplanner.managed.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.compositeam.businessmodel.service.TranscriptOfRecordsService;
import br.com.compositeam.businessmodel.service.UserService;
import br.com.compositeam.gradplanner.model.ClassPeriod;
import br.com.compositeam.gradplanner.model.Discipline;
import br.com.compositeam.gradplanner.model.Mention;
import br.com.compositeam.gradplanner.model.Result;
import br.com.compositeam.gradplanner.model.Student;
import br.com.compositeam.gradplanner.model.TranscriptOfRecords;


/*
 * Annotation to set up the name we use to call this 
 * class in the view.
 */
@ManagedBean(name= "transcriptMB")
/*
 * The class scope is (the persistence of the class in the memory)
 * will continue until HTTP session lives.
 */
@SessionScoped
public class RegisterTranscriptBean {


	private Student student;
	private String description;
	private Mention mention;
	private Discipline discipline;
	private ClassPeriod period;
	
	private TranscriptOfRecordsService transcriptOfRecordsService;
	private ArrayList<Result> results;
	private Double ira;
	private Result result;

	/*
	 * Log will be used to help the code debug
	 */
	private static Logger logger;

	public void addResults(){
		
		//New instance of a result
		Result resultToInsert = new Result();
		ArrayList<Result> resultsList = new ArrayList<Result>();

		resultToInsert.setDiscipline(discipline);
		resultToInsert.setMention(mention);
		resultsList.add(resultToInsert);
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		transcriptOfRecordsService = context.getBean(TranscriptOfRecordsService.class);
		transcriptOfRecordsService.save(resultsList);
		context.close();
	}
	
	
	public String addTranscript(ArrayList<Result> results){
		TranscriptOfRecords transcriptOfRecords = new TranscriptOfRecords();
		logger.info("A new instance of transcript of record is being created");
		//logger.info();
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		transcriptOfRecordsService = context.getBean(TranscriptOfRecordsService.class);
		transcriptOfRecordsService.save(results);
		context.close();
		return "sucess";
	}

	public Double getIra() {
		return ira;
	}

	public void setIra(Double ira) {
		this.ira = ira;
	}

	public ArrayList<Result> getResults() {
		return results;
	}

	public void setResults(ArrayList<Result> results) {
		this.results = results;
	}


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

	public ClassPeriod getPeriod() {
		return period;
	}

	public void setPeriod(ClassPeriod period) {
		this.period = period;
	}


	public Discipline getDiscipline() {
		return discipline;
	}


	public void setDiscipline(Discipline discipline) {
		this.discipline = discipline;
	}
	
}
