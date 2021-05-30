package dataAccess;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface JobAdvertDao<JobAdvert> extends JpaRepository<JobAdvert, Integer> {
	 @Query("From JobAdvert where isOpen = true")
	    List<JobAdvert> getAllOpenJobAdvertList();

	    @Query("From JobAdvert where isOpen = true Order By publishedAt Desc")
	    List<JobAdvert> findAllByOrderByPublishedAtDesc();

	    @Query("From JobAdvert where isOpen = true and employer =:id")//employer_id
	    List<JobAdvert> getAllOpenJobAdvertByEmployer(int id);
}
