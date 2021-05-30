package business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sun.net.httpserver.Authenticator.Result;

import business.abstracts.CandidateService;
import core.utilities.results.DataResult;
import dataAccess.CandidateDao;
import entities.concretes.Candidate;

public class CandidateManager implements CandidateService{
	
private CandidateDao candidateDao;
	
	
	@Autowired
	public CandidateManager(CandidateDao candidateDao) {
		super();
		this.candidateDao = candidateDao;
	}

	@Override
	public DataResult<List<Candidate>> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<Candidate> getByidentificationNumber(String identificationNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<Candidate> getByEmailAddress(String EmailAddress) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result add(Candidate candidate) {
		// TODO Auto-generated method stub
		return null;
	}

}
