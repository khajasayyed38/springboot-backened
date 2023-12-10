package net.javaguide.springbootbackened;

import net.javaguide.springbootbackened.model.Employee;
import net.javaguide.springbootbackened.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackenedApplication{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackenedApplication.class, args);
	}

//	@Autowired
//	EmployeeRepository employeeRepository;
//	@Override
//	public void run(String... args) throws Exception {
//		Employee employee=new Employee();
//		employee.setFirstName("Ramesh");
//		employee.setLastName("fadatare");
//		employee.setEmailId("ramesh@gmail.com");
//		employeeRepository.save(employee);
//
//		Employee employee1= new Employee();
//		employee1.setFirstName("John");
//		employee1.setLastName("cena");
//		employee1.setEmailId("cena@gmail.com");
//		employeeRepository.save(employee1);
//	}
}
