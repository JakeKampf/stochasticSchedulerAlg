package Controllers;
import scheduler.OptaplannerStart;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;
import DataModels.*;
@RestController
public class CohortRestController {
	private static boolean cohortCalcRunning;
	private static OptaplannerStart currentScheduler;
	private static Thread optThread;
	public static void init() {
		cohortCalcRunning = false;
		currentScheduler = null;
	}
	
	@PostMapping("/start")
	public static String start(@RequestBody StartRequest request)
	{
		if(cohortCalcRunning) {
			return "Already running";
		}
		
		currentScheduler = new OptaplannerStart(request.getFile(),request.getRequirements(),request.getCount());
		
		optThread = new Thread(currentScheduler);
		optThread.start();
		return "Started";
	}
	
	@GetMapping("/status")
	public static String status() {
		if(currentScheduler == null)
			return "status: \"started\"";
		else if(currentScheduler.isFinished()) {
			return "status: \"finished\"";
		}
		else {
			return "status: \"not finished\"";
		}
	}

}
