package business.abstracts;

import java.util.List;

import com.sun.net.httpserver.Authenticator.Result;

import core.utilities.results.DataResult;
import entities.concretes.Candidate;

public interface CandidateService {
	DataResult<List<Candidate>>getAll();
	DataResult<Candidate> getByidentificationNumber(String identificationNumber);
	DataResult<Candidate> getByEmailAddress(String EmailAddress);

	Result add(Candidate candidate);
}
