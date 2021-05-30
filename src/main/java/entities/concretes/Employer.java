package entities.concretes;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.apache.tomcat.jni.User;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@PrimaryKeyJoinColumn(name="user_id")
@Table(name="employers")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdverts"})
public class Employer extends User {
	@Column(name="company_name")
	private String company_name;
	
	@Column(name="web_address")
	private String web_address;
	
	@Column(name="phone_number")
	private String phone_number;
	
	@Column(name="is_verified",columnDefinition ="boolean default false")
	private boolean isVerified=false;
	
	@OneToMany(mappedBy="employer")
	private List<JobAdvert>jobAdverts;
	
}
