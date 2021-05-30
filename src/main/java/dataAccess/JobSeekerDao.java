package dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

public interface JobSeekerDao<Jobseeker> extends JpaRepository<Jobseeker, Integer> {
	  Jobseeker findJobseekerByNationalId(String nationalId);
}
