package entities.concretes;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity

@Table(name = "candidates")
@PrimaryKeyJoinColumn(name="user_id")

public class Candidate extends User{
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "identification_number")
	private String identificationNumber;
	
	@Column(name = "birth_date")
	private Date birthDate;

	@Column(name="is_verified", columnDefinition="boolean default false")
	private boolean isVerified=false;

}
