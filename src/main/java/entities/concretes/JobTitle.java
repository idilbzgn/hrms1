package entities.concretes;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="job_title")
public class JobTitle {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="job_title")
	private String title;
	
	@Column(name= "created_at", columnDefinition = "Date default CURRENT_DATE")
	private LocalDate createdDate = LocalDate.now();
	
	@Column(name= "is_active", columnDefinition = "boolean default true")
	private boolean isActive = true;
	
	@Column(name= "is_deleted", columnDefinition = "boolean default false")
	private boolean isDeleted = false;
	
	@OneToMany(mappedBy = "jobPosition")
	private List<JobAdvert> jobAdverts; 
}
