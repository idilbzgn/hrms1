package business.abstracts;

import com.sun.net.httpserver.Authenticator.Result;

import core.utilities.results.DataResult;

public interface JobTitleService<JobTitle> {

	DataResult<JobTitle> getByTitle(String title);
	Result add(JobTitle jobTitle);
}
