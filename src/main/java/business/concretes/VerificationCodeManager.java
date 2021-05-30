package business.concretes;

import org.springframework.beans.factory.annotation.Autowired;

import com.sun.net.httpserver.Authenticator.Result;

import business.abstracts.VerificationService;
import dataAccess.VerificationCodeDao;
import entities.concretes.VerificationCode;

public class VerificationCodeManager implements VerificationService{

	@Override
	public Result add(VerificationCode verificationCode) {
		// TODO Auto-generated method stub
		return null;
	}
private VerificationCodeDao verificationCodeDao;
	
	@Autowired
	public VerificationCodeManager(VerificationCodeDao verificationCodeDao) {
		super();
		this.verificationCodeDao = verificationCodeDao;
	}

}
