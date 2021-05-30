package business.abstracts;

import java.util.List;

import org.apache.tomcat.jni.User;

import com.sun.net.httpserver.Authenticator.Result;

import core.utilities.results.DataResult;

public interface UserService {
	DataResult<List<User>>getAll();
	Result add(User user);
	DataResult<User>getUserByEmail(String email);
}
