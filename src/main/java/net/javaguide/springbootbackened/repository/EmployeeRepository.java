package net.javaguide.springbootbackened.repository;

import net.javaguide.springbootbackened.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
