package business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sun.net.httpserver.Authenticator.Result;

import business.abstracts.EmployerService;
import core.utilities.results.DataResult;
import core.utilities.results.SuccessDataResult;
import core.utilities.results.SuccessResult;
import dataAccess.EmployerDao;
import entities.concretes.Employer;

public class EmployerManager implements EmployerService {
private EmployerDao employerDao;
	
	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao=employerDao;
	}
	


	public DataResult<List<Employer>> getAll() {
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll());
	}



	@Override
	public Result add(Employer employer) {
		// TODO Auto-generated method stub
		return null;
	}



	

}
