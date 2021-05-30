package northwind.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.sun.net.httpserver.Authenticator.Result;

import business.abstracts.CityService;
import core.utilities.results.DataResult;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

public class CityController<City> {

	private CityService cityService;
	
	@Autowired
	public CityController(CityService cityService) {
		super();
		this.cityService = cityService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<City>>getAll(){
		return null;
		
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody City city) {
		return null;
		
	}
}
