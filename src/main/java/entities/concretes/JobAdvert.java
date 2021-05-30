package entities.concretes;
import javax.persistence.*;
import java.time.LocalDate;
public class JobAdvert {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "id")
	    private int id;



	    @Column(name = "description")
	    private String description;

	    @Column(name = "salary_min")
	    private int salaryMin;

	    @Column(name = "salary_max")
	    private int salaryMax;

	    @Column(name = "open_position_count")
	    private int openPositionCount;

	    @Column(name = "deadline")
	    private LocalDate deadline;

	    @Column(name = "published_at")
	    private LocalDate publishedAt;

	    @Column(name = "created_at")
	    private LocalDate createdAt;

	    @Column(name = "is_open")
	    private boolean isOpen;

	    @Column(name = "is_active")
	    private boolean isActive;

	    @Column(name = "is_deleted")
	    private boolean isDeleted;

	    @ManyToOne
	    @JoinColumn(name = "job_position_id")
	    private JobTitle jobPosition;

	    @ManyToOne
	    @JoinColumn(name = "employer_id")
	    private Employer employer;

	    @ManyToOne
	    @JoinColumn(name = "city_id")
	    private City city;

		public boolean isOpen() {
			// TODO Auto-generated method stub
			return false;
		}

		public void setOpen(boolean b) {
			// TODO Auto-generated method stub
			
		}

		public Object getJobPosition() {
			// TODO Auto-generated method stub
			return null;
		}

		public Object getDescription() {
			// TODO Auto-generated method stub
			return null;
		}

		public Object getCity() {
			// TODO Auto-generated method stub
			return null;
		}

		public int getOpenPositionCount() {
			// TODO Auto-generated method stub
			return 0;
		}

		
		}

