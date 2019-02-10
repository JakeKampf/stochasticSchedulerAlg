import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import Controllers.CohortRestController;
@SpringBootApplication
import org.optaplanner.core.api.solver.*;
import CohortsSolverData.CohortSolution; 
import CohortDataClasses.*;
import java.io.FileNotFoundException;
import java.util.*;
import CohortScoring.cohortScoring;

import org.apache.http.NameValuePair;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;


public class Main {
	public static void main(String[] args) {
		CohortRestController.init();
		SpringApplication.run(Main.class,args);
	}
	
	private static List<Cohort> putAssignmentsInCohorts(CohortSolution solution) {
		Map<String,List<Section>> sectMap = new HashMap<>();
		for(CohortSectionAssignment csa: solution.getAssignments()) {
			if(sectMap.containsKey(csa.getMyCohort().getName())) {
				List<Section> temp = sectMap.get(csa.getMyCohort().getName());
				temp.add(csa.getAssignment());
				sectMap.put(csa.getMyCohort().getName(),temp);
			}else {
				List<Section> temp = new ArrayList<>();
				temp.add(csa.getAssignment());
				sectMap.put(csa.getMyCohort().getName(), temp);
			}
		}
		List<String> cohortNames = new ArrayList<String>(sectMap.keySet());
		List<Cohort> cohorts = new ArrayList<>();
		for(String name:cohortNames) {
			Cohort coh = new Cohort();
			coh.setName(name);
			coh.setClassAssignments(sectMap.get(name));
			cohorts.add(coh);
		}
		return cohorts;
	}
	
	public static void addSolutionToDB(CohortSolution s) throws Exception {
		CloseableHttpClient httpclient = HttpClients.createDefault();
		try {
			for(CohortSectionAssignment csa: s.getAssignments()) {
				HttpPost post = new HttpPost("localhost:3000/assignment");
				List<NameValuePair> params = new ArrayList<>();
				//add params to list
				CloseableHttpResponse response = httpclient.execute(post);
				assert(response.getStatusLine().getStatusCode()==(200));
			    
			}
			httpclient.close();
		}finally {
			httpclient.close();
		}
	}
}
