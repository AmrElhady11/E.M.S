package employee.crud.dao;

import java.sql.SQLException;
import java.util.List;

import employee.crud.beans.Employee;

public interface EmployeeDAO {

	public boolean addEmployee(Employee employee) throws SQLException;
	
	public boolean deleteEmployee(int employeeId) throws SQLException;
	
	public boolean updateEmployee(Employee employee) throws SQLException;
	
	public Employee getEmployee(int employeeId) throws SQLException;
	
	public List<Employee> getAllEmployees() throws SQLException;
}
