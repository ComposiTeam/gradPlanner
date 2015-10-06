package br.com.compositeam.gradplanner.test.model;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import br.com.compositeam.gradplanner.model.Result;
import br.com.compositeam.gradplanner.model.Student;
import br.com.compositeam.gradplanner.model.TranscriptOfRecords;

public class TranscriptOfRecordsTest {

	public double iraUnderTest = 3.0;
	public Student studentUnderTest = new Student();
	public ArrayList<Result> resultsUnderTest = new ArrayList<Result>();
	public TranscriptOfRecords transcriptUnderTest = new TranscriptOfRecords(); //Object without initialized attributes

	@Test
	public void testSetIra() {
		
		transcriptUnderTest.setIra(iraUnderTest);
		
		assertTrue(transcriptUnderTest.getIra()==3.0);
		
	}
	

}
