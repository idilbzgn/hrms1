package business.abstracts;

import java.util.List;

import com.sun.net.httpserver.Authenticator.Result;

import core.utilities.results.DataResult;
import core.utilities.results.SuccessResult;
import entities.concretes.Employer;

public interface EmployerService {
	Result add(Employer employer);
	DataResult<List<Employer>>getAll();
}
