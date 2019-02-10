package dataModels;
import java.util.List;
import org.springframework.web.multipart.*;
public class StartRequest {
	private MultipartFile file;
	private List<Requirement> requirements;
	private int count;
	
	public List<Requirement> getRequirements(){
		return requirements;
	}
	
	public int getCount() {
		return count;
	} 
	
	public MultipartFile getFile() {
		return file;
	}
	
	public StartRequest(MultipartFile file, List<Requirement> requirements,int count) {
		this.count = count;
		this.file = file;
		this.requirements = requirements;
	}
}
