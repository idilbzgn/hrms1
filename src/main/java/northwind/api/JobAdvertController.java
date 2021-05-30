package northwind.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sun.net.httpserver.Authenticator.Result;

import business.abstracts.JobAdvertService;
import core.utilities.results.DataResult;
import entities.concretes.JobAdvert;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api/advert")

public class JobAdvertController {
private JobAdvertService jobAdvertService;
	
	@Autowired
	public JobAdvertController(JobAdvertService jobAdvertService){
		super();
		this.jobAdvertService=jobAdvertService;
	}
	
	@GetMapping("/getAll")
	public DataResult<List<JobAdvert>> getAll(){
		return this.jobAdvertService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobAdvert jobAdvert) {
		return this.jobAdvertService.add(jobAdvert);
	}
	
	@GetMapping("/getAllOpenJobAdvertList")
	public DataResult<List<JobAdvert>> getAllOpenJobAdvertList(){
		return this.jobAdvertService.gettAllOpenJobAdvertList();
	}
	
	@GetMapping("/findAllByOrderByPublishedAtDesc")
	public DataResult<List<JobAdvert>> findAllByOrderByPublishedAtDesc(){
		return this.jobAdvertService.findAllByOrderByPublishedAtDesc();
	}
	
	@GetMapping("/findAllByOrderByPublishedAtDesc")
	public DataResult<List<JobAdvert>> findAllByOrderByPublishedAtAsc(){
		return this.jobAdvertService.findAllByOrderByPublishedAtAsc();
	}
	
	@GetMapping("/getAllOpenAdvertByEmployer")
	public DataResult<List<JobAdvert>> getAllOpenAdvertByEmployer(int id){
		return this.jobAdvertService.getAllOpenAdvertByEmployer(id);
	}
	
	
	
	
	
}
