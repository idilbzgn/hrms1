package dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao<User> extends JpaRepository<User, Integer>{
	User findUserByEmail(String email);
}
