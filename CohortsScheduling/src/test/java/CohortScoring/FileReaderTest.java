package CohortScoring;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import CohortDataClasses.Course;
import CohortDataClasses.FileReader;

public class FileReaderTest {
	
	public FileReaderTest() {
		
	}
	
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileReader fr = new FileReader(); 
		List<Course> courseList = new ArrayList<Course>();
		
		courseList = FileReader.separateSectionsIntoCourses(fr.readCourseExcel("TestFiles/testCourseOfferings.xlsx")); 
		
			for(int i = 0; i<courseList.size(); i++) {
				System.out.println(courseList.get(i).getName());
			}
	
		
	}
	
	
}
