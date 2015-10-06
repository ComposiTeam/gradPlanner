package br.com.compositeam.gradplanner.managed.bean;

import java.awt.event.ActionEvent;
import java.util.logging.Logger;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

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

	private TranscriptOfRecords transcriptOfRecords;
	
	
	
	/*
	 * Log will be used to help the code debug
	 */
	private static Logger logger;
	
	/**
	 * In the view, this method can be called
	 * to create a new instance of transcript of records
	 * @param event
	 */
	public void createTranscript(ActionEvent event){
		transcriptOfRecords = new TranscriptOfRecords();
	}

	public void saveTranscript(ActionEvent event){
		try{
			
		}
	}
	
	
}
