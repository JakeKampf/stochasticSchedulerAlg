package service;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;
import runnable.ScheduleRunnable;

import controller.ScheduleController;
import dataModels.StartRequest;
@RestController
public class RestService {
	
	@PostMapping("/start")
	public static String start(@RequestBody StartRequest request) {
		return ScheduleController.start(request);
		//starts scheduling
	}
	@GetMapping("/status")
	public static String status() {
		return ScheduleController.status();
		
	}
	@PostMapping("/cancel")
	public static String cancel() {
		return ScheduleController.cancel();
		
	}

}
