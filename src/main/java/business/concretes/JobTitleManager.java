package business.concretes;

import com.sun.net.httpserver.Authenticator.Result;

import business.abstracts.JobTitleService;
import core.utilities.results.DataResult;
import dataAccess.JobTitleDao;

public class JobTitleManager implements JobTitleService{
	private JobTitleDao jobTitleDao;

	@Override
	public DataResult getByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result add(Object jobTitle) {
		// TODO Auto-generated method stub
		return null;
	}

	public JobTitleManager(JobTitleDao jobTitleDao) {
		super();
		this.jobTitleDao = jobTitleDao;
	}

	

}
