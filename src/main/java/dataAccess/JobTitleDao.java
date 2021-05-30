package dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import entities.concretes.JobTitle;

public interface JobTitleDao extends JpaRepository<JobTitle,Integer>{
JobTitle findByTitle(String title);
	
	boolean existsByTitle(String title);
}
