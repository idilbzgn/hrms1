package entities.concretes;
import java.util.List;

import javax.persistence.Column;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Table(name = "cities")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdverts"})

public class City {
	 @Id
	    @GeneratedValue
	    @Column(name = "id")
	    private int id;

	    @Column(name = "name")
	    private String name;

	    @OneToMany(mappedBy = "city")
	    private List<JobAdvert> jobAdverts;

}
