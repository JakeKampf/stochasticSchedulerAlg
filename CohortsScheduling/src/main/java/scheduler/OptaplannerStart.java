package scheduler;

import java.util.ArrayList;
import org.springframework.web.multipart.*;
import DataModels.Requirement;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.optaplanner.core.api.solver.Solver;
import org.optaplanner.core.api.solver.SolverFactory;

import CohortDataClasses.ClassRequirement;
import CohortDataClasses.Cohort;
import CohortDataClasses.CohortSectionAssignment;
import CohortDataClasses.Course;
import CohortDataClasses.FileReader;
import CohortDataClasses.Section;
import CohortScoring.cohortScoring;
import CohortsSolverData.CohortSolution;
import org.optaplanner.core.api.solver.*;
import CohortsSolverData.CohortSolution; 
import CohortDataClasses.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import CohortScoring.cohortScoring;
public class OptaplannerStart implements Runnable {
	private MultipartFile inputFile;
	private int count;
	private List<Requirement> reqs;
	private boolean finished;
	public void run() {
		finished = false;
		scheduleRunner(inputFile,reqs,count);
	}
	
	public boolean isFinished() {
		return finished;
	}
	
	public OptaplannerStart(MultipartFile file,List<Requirement> reqs,int count) {
		this.count = count;
		this.inputFile = file;
		this.reqs = reqs;
	}
	
	public static void scheduleRunner(CohortSolution solutions[],List<Requirement> reqs,int count)
    {
    	try {
    		
    		SolverFactory<CohortSolution> factory = SolverFactory.createFromXmlResource("SolverConfig.xml");
    		Solver<CohortSolution> solver = factory.buildSolver();
    		cohortScoring score = new cohortScoring();
    		for(int i = 0; i<1 ;i++){
    			System.out.println("Before: " + score.calculateScore(solutions[i]));
    			solutions[i] = (CohortSolution)solver.solve(solutions[i]);
    			System.out.println("After: " + score.calculateScore(solutions[i]));
    		}
    		recordSolutions(solutions);
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    	
    	
    	
    }

	private static void recordSolutions(CohortSolution[] solutions) {
		for(CohortSolution s: solutions) {
			System.out.println(s.getAssignments().get(0).getAssignment().getName());
			System.out.println("\nSolution");
			List<Cohort> cohorts = putAssignmentsInCohorts(s);
			for(Cohort c: cohorts) {
				System.out.println("Cohort "+c.getName()+" classes:");
				for(Section sect:c.getClassAssignments()) {
					if(sect.getStartTime()!=null) {
						System.out.println("Class: "+sect.getName()
						+" Section: "+sect.getSectionId()
						+" Days: "+sect.getDaysOfWeek()
						+" Time: "+ sect.getStartTime().toString()
						+" - "+sect.getEndTime().toString());
					}else {
						System.out.println("Class: "+sect.getName()
						+" Section: "+sect.getSectionId()
						+" Days: "+sect.getDaysOfWeek()
						+" ONLINE");
					}
						
				}
			}
		}
		
	}
}
