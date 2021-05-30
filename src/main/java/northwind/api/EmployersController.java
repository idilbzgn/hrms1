package northwind.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.sun.net.httpserver.Authenticator.Result;

import business.abstracts.EmployerService;
import core.utilities.results.DataResult;
import entities.concretes.Employer;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

public class EmployersController {
private EmployerService employerService;
	
	@Autowired
	public EmployersController(EmployerService employerService) {
		super();
		this.employerService = employerService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Employer>>getAll(){
		return this.employerService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Employer employer) {
		return this.add(employer);
	}
}
