package controller;

import dataModels.StartRequest;
import runnable.CohortRunnableFactory;
import runnable.ScheduleRunnable;

public class ScheduleController {

	private static boolean cohortCalcRunning;
	private static ScheduleRunnable currentScheduler;
	private static Thread optThread;
	public static void init() {
		cohortCalcRunning = false;
		currentScheduler = null;
	}
	
	public static String start(StartRequest request) {
		if(cohortCalcRunning) {
			return "Already running";
		}
		
		currentScheduler = CohortRunnableFactory.checkInputAndCreate(request);
		
		optThread = new Thread(currentScheduler);
		optThread.start();
		return "Started";
	}
	
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
	
	public static String cancel() {
		if(optThread.isAlive()) {
			optThread.interrupt();
			return "Scheduling will stop at next exit point";
		}
		
		return "No active scheduler";
	}

}
