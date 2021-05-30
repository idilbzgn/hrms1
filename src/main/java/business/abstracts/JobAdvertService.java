package business.abstracts;

import java.util.List;

import com.sun.net.httpserver.Authenticator.Result;

import core.utilities.results.DataResult;
import entities.concretes.JobAdvert;

public interface JobAdvertService {
	Result add(JobAdvert jobAdvert);
	DataResult<List<JobAdvert>> getAll();
	DataResult<List<JobAdvert>> gettAllOpenJobAdvertList();
	DataResult<List<JobAdvert>> findAllByOrderByPublishedAtDesc();
	DataResult<List<JobAdvert>> findAllByOrderByPublishedAtAsc();
	DataResult<List<JobAdvert>> getAllOpenAdvertByEmployer(int id);
	Result update(JobAdvert jobAdvert);



}
