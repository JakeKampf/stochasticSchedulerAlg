import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import Controllers.CohortRestController;
@SpringBootApplication
public class Main {
	public static void main(String[] args) {
		CohortRestController.init();
		SpringApplication.run(Main.class,args);
	}
	
}
