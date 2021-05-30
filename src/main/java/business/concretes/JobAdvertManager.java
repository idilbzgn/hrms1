package business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sun.net.httpserver.Authenticator.Result;

import business.abstracts.JobAdvertService;
import core.utilities.results.DataResult;
import core.utilities.results.ErrorResult;
import core.utilities.results.SuccessDataResult;
import core.utilities.results.SuccessResult;
import dataAccess.JobAdvertDao;
import entities.concretes.JobAdvert;

@Service

public class JobAdvertManager implements JobAdvertService {

	@Override
	public Result add(JobAdvert jobAdvert) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<JobAdvert>> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<JobAdvert>> gettAllOpenJobAdvertList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<JobAdvert>> findAllByOrderByPublishedAtDesc() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<JobAdvert>> findAllByOrderByPublishedAtAsc() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<JobAdvert>> getAllOpenAdvertByEmployer(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Result update(JobAdvert jobAdvert) {
		// TODO Auto-generated method stub
		return null;
	}
}
	