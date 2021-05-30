package northwind.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.sun.net.httpserver.Authenticator.Result;

import business.abstracts.CandidateService;
import core.utilities.results.DataResult;
import entities.concretes.Candidate;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

public class CandidatesController<Candidate> {

	private CandidateService candidateService;
	
	
	@Autowired
	public CandidatesController(CandidateService candidateService) {
	super();
	this.candidateService = candidateService;
}


	@GetMapping("/getall")
	public DataResult<List<Candidate>> getAll(){
		return null;
		
	}
	
	
	@PostMapping("/add")
	public Result add(@RequestBody Candidate candidate) {
		return null;
		
	
	}
	
}
