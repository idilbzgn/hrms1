package dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDao<Employee> extends JpaRepository<Employee, Integer> {


}
