package entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="verification_codes")

public class VerificationCode {
	@Id
    @GeneratedValue
    @Column(name="id")
    private int id;

    @Column(name="user_id")
    private int userId;

    @Column(name="code")
    private String code;

    @Column(name="is_confirmed")
    private boolean isConfirmed;

    @Column(name="created_at", columnDefinition = "Date defult CURRENT_DATE")
    private LocalDate createAt = LocalDate.now();


    public VerificationCode(int id, String code, LocalDate now) {
    }


	public void add(VerificationCode verificationCode) {
		// TODO Auto-generated method stub
		
	}
}
