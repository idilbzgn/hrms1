package business.concretes;

import java.util.List;

import org.apache.tomcat.jni.User;
import org.springframework.beans.factory.annotation.Autowired;

import com.sun.net.httpserver.Authenticator.Result;

import business.abstracts.UserService;
import core.utilities.results.DataResult;
import dataAccess.UserDao;

public class UserManager implements UserService {
private UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao){
		super();
		this.userDao = userDao;
	}

	@Override
	public DataResult<List<User>> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result add(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<User> getUserByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

}
