package dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployerDao<Employer> extends JpaRepository<Employer , Integer>{

}
