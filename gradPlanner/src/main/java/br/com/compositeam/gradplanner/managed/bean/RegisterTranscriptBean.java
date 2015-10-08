package br.com.compositeam.gradplanner.managed.bean;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.compositeam.gradplanner.model.Mention;
import br.com.compositeam.gradplanner.model.Result;
import br.com.compositeam.gradplanner.model.Student;
import br.com.compositeam.gradplanner.model.TranscriptOfRecords;
import br.com.compositeam.businessmodel.service.TranscriptOfRecordsService;;

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

	private TranscriptOfRecords transcriptOfRecords;
	private Student student;
	private String description;
	private Mention mention;
	private int period;
	
	private TranscriptOfRecordsService transcriptOfRecordsService;
	private ArrayList<Result> results;
	private Double ira;
	private Result result;
	/*
	 * Log will be used to help the code debug
	 */
	private static Logger logger;
	
	public String addResults(){
		
		List<Result> results = new ArrayList<Result>();
		result.setPeriod(period);
		result.setDescription(description);
		result.setMention(mention);
		
		
		return "sucess";
	}
	
	
	public String addTranscript(ArrayList<Result> results){
		transcriptOfRecords = new TranscriptOfRecords();
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

	public int getPeriod() {
		return period;
	}

	public void setPeriod(int period) {
		this.period = period;
	}
	
}
