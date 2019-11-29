package composite;

import java.util.ArrayList;
import java.util.List;

public class CompanyEmployees implements Employee {
	
	private List<Employee> emps = new ArrayList<Employee>();
	
	public void addEmployee(Employee emp) {
		emps.add(emp);
	}
	
	public void removeEmployee(Employee emp) {
		emps.remove(emp);
	}

	@Override
	public void showEmpDetails() {
		
		emps.forEach(obj -> obj.showEmpDetails());
		
	}

}
