package northwind.api;

import java.util.List;

import org.apache.tomcat.jni.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.sun.net.httpserver.Authenticator.Result;

import business.abstracts.UserService;
import core.utilities.results.DataResult;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

public class UserController {
private UserService userService;
	
	@Autowired
	public void UsersController(UserService userService) {
		
		this.userService = userService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<User>>getAll(){
		return null;
		
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody User user) {
		return this.userService.add(user);
	}
}
