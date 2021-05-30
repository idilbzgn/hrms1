package northwind.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.sun.net.httpserver.Authenticator.Result;

import business.abstracts.JobTitleService;
import core.utilities.results.DataResult;
import entities.concretes.JobTitle;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

public class JobTitleControllers {
private JobTitleService jobTitleService;
	
	@Autowired
	public void JobTitleController(JobTitleService jobTitleService) {
		
		
		this.jobTitleService = jobTitleService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<JobTitle>> getAll(){
		return ((JobTitleControllers) this.jobTitleService).getAll();
	}
	
	@PostMapping("/add")
	public Result add (@RequestBody JobTitle jobTitlen) {
		Object jobTitle = null;
		return this.jobTitleService.add(jobTitle);
	}
}
