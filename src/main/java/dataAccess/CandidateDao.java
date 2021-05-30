package dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import entities.concretes.Candidate;

public interface CandidateDao extends JpaRepository<Candidate,Integer> {
	Candidate findByidentificationNumber(String identificationNumber);
	Candidate findByEmail(String email);
}
