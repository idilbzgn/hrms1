package entities.concretes;
import javax.persistence.Column;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Table(name="employees")
@PrimaryKeyJoinColumn(name="user_id")
public class Employee extends User{
	 @Column(name = "first_name")
	    private String firstName;

	    @Column(name = "last_name")
	    private String lastName;
}
