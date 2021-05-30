package business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sun.net.httpserver.Authenticator.Result;

import business.abstracts.EmployeeService;
import core.utilities.results.DataResult;
import core.utilities.results.SuccessResult;
import dataAccess.EmployeeDao;
import entities.concretes.Employee;

public class EmployeeManager implements EmployeeService {
	private EmployeeDao<?> employeeDao;

    @Autowired
    public EmployeeManager(EmployeeDao<?> employeeDao) {
        this.employeeDao = employeeDao;
    }

	public SuccessResult add1(Employee employee) {
	
      return new SuccessResult("Employee has been added.");
	}



   
	@Override
	public Result add(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<Employee>> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
