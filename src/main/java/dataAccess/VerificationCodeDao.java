package dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VerificationCodeDao<VerificationCode> extends JpaRepository<VerificationCode, Integer>{

}
