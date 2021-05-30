package business.abstracts;





import java.util.List;

import com.sun.net.httpserver.Authenticator.Result;

import core.utilities.results.DataResult;
import entities.concretes.Employee;

public interface EmployeeService {
	 Result add(Employee employee);

	 DataResult<List<Employee>> getAll();

}
