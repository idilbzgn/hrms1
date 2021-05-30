package entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")

public class User {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)

	    @Column(name = "id")
	    private int id;

	    @Column(name = "email")
	    private String email;

	    @Column(name = "password")
	    private String password;

	    @Column(name= "created_at", columnDefinition = "Date defult CURRENT_DATE")
	    private LocalDate createdAt = LocalDate.now();

	    @Column(name= "is_active", columnDefinition = "boolean default true")
	    private boolean isActive = true;

	    @Column(name= "is_deleted", columnDefinition = "boolean default false")
	    private boolean isDeleted = false;

}
