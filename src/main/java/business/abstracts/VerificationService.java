package business.abstracts;

import com.sun.net.httpserver.Authenticator.Result;

import entities.concretes.VerificationCode;

public interface VerificationService {
	 Result add(VerificationCode verificationCode);

	
}
